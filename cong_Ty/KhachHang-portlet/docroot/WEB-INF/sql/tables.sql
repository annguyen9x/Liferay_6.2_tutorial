create table KhachHang (
	MaKH INTEGER not null primary key,
	TenKH VARCHAR(75) null,
	MatKhau VARCHAR(75) null,
	Email VARCHAR(75) null,
	DienThoai VARCHAR(75) null,
	GioiTinh BOOLEAN,
	NgaySinh DATE null,
	DiaChi  VARCHAR(75) null
);