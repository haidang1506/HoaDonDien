/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class KhachHang {
    String hoten;
    String diachi;
    String macongto;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diachi, String macongto) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.macongto = macongto;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMacongto() {
        return macongto;
    }

    public void setMacongto(String macongto) {
        this.macongto = macongto;
    }
    
}
