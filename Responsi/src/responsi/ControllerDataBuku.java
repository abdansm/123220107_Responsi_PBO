/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ABDAN SM
 */
public class ControllerDataBuku extends ModelDataBuku implements InterControllerDataBuku {
    double k = 500.0;
    
    @Override
    public void olahData(double hargaSementara){
    harga = hargaSementara+k+(rating*100);
    
    }
}
