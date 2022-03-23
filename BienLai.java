/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class BienLai extends KhachHang{
    int chisodau;
    int chisocuoi;
    final static int dongia = 750;

    public BienLai() {
    }

    public BienLai(int chisodau, int chisocuoi, String hoten, String diachi, String macongto) {
        super(hoten, diachi, macongto);
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public int getChisodau() {
        return chisodau;
    }

    public void setChisodau(int chisodau) {
        this.chisodau = chisodau;
    }

    public int getChisocuoi() {
        return chisocuoi;
    }

    public void setChisocuoi(int chisocuoi) {
        this.chisocuoi = chisocuoi;
    }

    public double TinhTienDien(){
        double thanhtien;
        int sotieuthu = chisocuoi - chisodau;
        if(sotieuthu<100)
        {
            thanhtien = sotieuthu*dongia;
        }
        else if(sotieuthu>=100 && sotieuthu<300)
        {
            thanhtien = sotieuthu*dongia*1.05;
        }
        else
        {
            thanhtien = sotieuthu*dongia*1.1;
        }
        return thanhtien;
    }
}
