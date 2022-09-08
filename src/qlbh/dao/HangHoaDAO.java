/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import qlbh.model.ChucVu;

/**
 *
 * @author Bao Nhu
 */
public class ChucVuDAO {
    
    //lấy danh sách chức vụ
    public static ArrayList<ChucVu>layDanhSachChucVu(){
        ArrayList<ChucVu> danhSachChucVu = new ArrayList<ChucVu>();
       
        try {
            String sql = "Select * from ChucVu";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                ChucVu chuVu = new ChucVu();
                chuVu.setMaCV(resultSet.getString("MACV"));
                chuVu.setTenCV(resultSet.getString("TENCV"));
                chuVu.setLuong(resultSet.getFloat("LUONG"));
                danhSachChucVu.add(chuVu);
            }
            provider.Close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachChucVu;
    }
    
    //thêm chức vụ
    public static boolean themChucVu(ChucVu chucVu){
        boolean ketQua = false;
        String sql = String.format("insert into chucvu(macv, tencv, luong) values('%s', N'%s', '%f');", chucVu.getMaCV(), chucVu.getTenCV(), chucVu.getLuong());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.excuteUpdate(sql);
        if(n == 1){
            ketQua = true;
        }
        provider.Close();
        return ketQua;
    }
 
    //xóa chức vụ
    public static boolean xoaChucVu(String maChucVu){
        boolean ketQua= false;
        String sql = String.format("delete from chucvu where macv='%s'", maChucVu);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.excuteUpdate(sql);
        if(n == 1){
            ketQua = true;
        }
        provider.Close();
        return ketQua;
    }
    
    //tìm kiếm chức vụ
    public static ArrayList<ChucVu>timKiemChucVuTheoMa(String maChuVu){
        ArrayList<ChucVu> danhSachChuVu = new ArrayList<ChucVu>();
        try {
            String sql = "Select * from chucvu where macv like '%" + maChuVu + " %'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                ChucVu chucVu = new ChucVu();
                chucVu.setMaCV(resultSet.getString("macv"));
                chucVu.setTenCV(resultSet.getString("tencv"));
                chucVu.setLuong(resultSet.getFloat("luong"));
                danhSachChuVu.add(chucVu);
            }
            provider.Close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachChuVu;
    }
    
    //cập nhật chức vụ
    public static boolean capNhatChucVu(ChucVu chucVu){
        boolean ketQua = false;
        String sql = String.format("update chucVu set tencv = N'%s', luong = '%f' " + "where macv= '%s'", chucVu.getTenCV(), chucVu.getLuong(), chucVu.getMaCV());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.excuteUpdate(sql);
        if(n == 1){
            ketQua = true;
        }
        provider.Close();
        return ketQua;
    }
    
}
