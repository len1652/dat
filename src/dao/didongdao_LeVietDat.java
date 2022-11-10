package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.didongbean_LeVietDat;



public class didongdao_LeVietDat {
	public ArrayList<didongbean_LeVietDat> getdidong(){
		ArrayList<didongbean_LeVietDat> ds = new ArrayList<didongbean_LeVietDat>();
		try {
			//B1: Ket noi vao csdl QlSach
			ketNoi_LeVietDat kn = new ketNoi_LeVietDat();
			kn.Ketnoi();
			//B2: lay du lieu ve
			String sql ="select*from Didong";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//B3 : Duyet rs de luu vao ds
			while (rs.next()) {
				int madidong = rs.getInt("madidong");
				String tendidong= rs.getString("tendidong");
				String nhacungcap = rs.getString("nhacungcap");
				long gia = rs.getLong("gia");
				int soluong = rs.getInt("soluong");
				String anh = rs.getString("anh");
				ds.add(new didongbean_LeVietDat(madidong, tendidong, nhacungcap, gia, soluong, anh));
			}
			//b4: Dong cac doi tuong
			rs.close();
			kn.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ds;
	}
}
