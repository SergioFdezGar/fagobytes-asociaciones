
package g01_03.gest_asobu.persistencia;

import java.sql.*;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JOptionPane;

public class AgenteDB{
    protected static AgenteDB mInstancia = null;
    protected static Connection mBD;

    public AgenteDB(){
    }

    public static AgenteDB getAgente() throws Exception{
        if(mInstancia == null)
            mInstancia = new AgenteDB();
        return mInstancia;
    }
    
    public static Connection conectar() throws Exception{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/asobu_ddbb";
        //String url = "jdbc:mysql://212.122.119.21:3306/asobu_ddbb";
        try{
        	Class.forName(driver);
        	mBD = DriverManager.getConnection(url,"asobu","450buPr0y3ct");
        	//JOptionPane.showMessageDialog(null, "Connection Established");
        	return mBD;
        }catch (Exception e){
        	JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static void desconectar() throws Exception{
        mBD.close();
    }

    public int insert(String SQL) throws SQLException, Exception{
        conectar();
        PreparedStatement ps = mBD.prepareStatement(SQL);
        int dev = ps.executeUpdate();
        ps.close();
        desconectar();
        return dev;
    }

    public LinkedList<Vector<String>> select(String SQL) throws SQLException, Exception{
        conectar();
        PreparedStatement ps = mBD.prepareStatement(SQL);
        ResultSet info = ps.executeQuery();
        ResultSetMetaData meta_info = info.getMetaData();
        LinkedList<Vector<String>> dats = new LinkedList<Vector<String>>();
        for(; info.next(); dats.add(get_valor(info, meta_info)));
        ps.close();
        desconectar();
        return dats;
    }

    private Vector<String> get_valor(ResultSet info, ResultSetMetaData info_m) throws SQLException{
        Vector<String> result = new Vector<String>();
        int n_columnas = info_m.getColumnCount();
        for(int i = 1; i <= n_columnas; i++)
            switch(info_m.getColumnType(i))
            {
            case 4: // '\004'
            	result.add(Integer.toString(info.getInt(i)));
            	//result.add(Integer.valueOf(info.getInt(i)));
                break;

            case 8: // '\b'
            	result.add(Double.toString(info.getDouble(i)));
            	//result.add(Double.valueOf(info.getDouble(i)));
                break;

            case 12: // '\f'
            	result.add(info.getString(i));
                //result.add(info.getString(i));
                break;

            case 16: // '\020'
            	result.add(Boolean.toString(info.getBoolean(i)));
            	//result.add(Boolean.valueOf(info.getBoolean(i)));
                break;

            case 91: // '['
            	result.add(info.getString(i));
            	//result.add(info.getDate(i));
                break;

            case 0: // '\0'
                result.add(null);
                break;
            }

        return result;
    }

    public int delete(String SQL) throws SQLException, Exception{
        conectar();
        PreparedStatement ps = mBD.prepareStatement(SQL);
        int var = ps.executeUpdate();
        ps.close();
        desconectar();
        return var;
    }

    public int update(String SQL) throws SQLException, Exception{
        conectar();
        PreparedStatement ps = mBD.prepareStatement(SQL);
        int var = ps.executeUpdate();
        ps.close();
        desconectar();
        return var;
    }

}