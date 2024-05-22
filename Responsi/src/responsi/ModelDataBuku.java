package responsi;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ABDAN SM
 */
public class ModelDataBuku {
    private String judul;
    protected String penulis;
    protected double rating;
    protected double harga;
    
   
   
   public Statement st;
   public ResultSet rs;
   Connection cn = responsi.Koneksi.Koneksi();
  
    
   public void updateData(String judulama){
   try {
    st = cn.createStatement();
    st.executeUpdate("UPDATE buku set " 
        + "judul='"       + judul + "', "
        + "penulis='"      + penulis + "', "
        + "rating='"   + rating + "', "
        + "harga='"        + harga + "' where judul='"+judulama +"'");
    
    
  } catch (Exception e) {
    e.printStackTrace();
  }
   
   }
   
   
    public void simpanData(){
    try{
    st = cn.createStatement();
    
    st.executeUpdate("INSERT INTO buku (judul,penulis,rating,harga) VALUES('" + judul + "','"
        + penulis + "','"
        + rating + "','"
        + harga +  "')");
    JOptionPane.showMessageDialog(null,"Simpan Berhasil");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
    
   
    
    
    public void setJudul(String judulBaru){
        this.judul = judulBaru;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public void setPenulis(String penulisBaru){
        this.penulis = penulisBaru;
    }
    
    public String getPenulis(){
        return penulis;
    }

    public void setRating(double ratingBaru){
        this.rating = ratingBaru;
    }
    
    public double getRating(){
        return rating;
    }

    public void setHarga(double hargaBaru){
        this.harga = hargaBaru;
    }
    
    public double getHarga(){
        return harga;
    }
    
    
}
