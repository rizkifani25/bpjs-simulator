DROP TABLE IF EXISTS peserta_bpjs;
DROP TABLE IF EXISTS data_autodebet;

CREATE TABLE peserta_bpjs (
    jmlkeluarga INT,
    nama VARCHAR(100),
    nmcabang VARCHAR(100),
    noka VARCHAR(13),
    nova VARCHAR(16)
);

INSERT INTO peserta_bpjs(jmlkeluarga, nama, nmcabang, noka, nova) VALUES
(2, 'Rizki Saja', 'CIKARANG', '0001265125534', '8888801265125534'),
(4, 'Fani Aja', 'BEKASI', '0001265125535', '8888801265125535');

CREATE TABLE data_autodebet(
    noka VARCHAR(13),
    haridebet INT,
    norekening VARCHAR(100),
    namaonrekening VARCHAR(100),
    nohp VARCHAR(100),
    alamatemail VARCHAR(100),
    status_ INT
);

INSERT INTO data_autodebet(noka, haridebet, norekening, namaonrekening, nohp, alamatemail, status_) VALUES
('0001265125534', 1, '1111112222', 'Rizki Saja', '0888888888898', 'rizki.saja@gmail.com', 0),
('0001265125535', 1, '3334443342', 'Fani Aja', '0888882234898', 'fani.aja@gmail.com', 1);

CREATE TABLE info_autodebet(
    idhead INT,
    jmlkeluarga INT,
    kdasalpremi INT,
    kdbank VARCHAR(7),
    nama VARCHAR(255),
    namapic VARCHAR(255),
    nmbank VARCHAR(255),
    nmcabang VARCHAR(100),
    noka VARCHAR(13),
    nokapic VARCHAR(13),
    nokk VARCHAR(13),
    norekening VARCHAR(100),
    nova VARCHAR(16),
    premi INT,
    status_ INT,
    tgl_input VARCHAR(100)
);

INSERT INTO info_autodebet(idhead, jmlkeluarga, kdasalpremi, kdbank, nama, namapic, nmbank, nmcabang, noka, nokapic, nokk, norekening, nova, premi, status_, tgl_input) VALUES 
(0, 2, 0, 'PBMDR01', 'Rizki Saja', 'PIC X', 'MANDIRI', 'CIKARANG', '0001265125534', '0001265125512', '1231231233452', '1111112222', '8888801265125534', 0, 0, '23-11-2017'),
(0, 4, 0, 'PBMDR02', 'Fani Aja', 'PIC Z', 'MANDIRI', 'BEKASI', '0001265125535', '0001265125513', '1231231233455', '3334443342', '8888801265125535', 0, 1, '24-12-2017');

CREATE TABLE error_handler(
    errorcode VARCHAR(5),
    errormessage VARCHAR(255)
);

INSERT INTO error_handler(errorcode, errormessage) VALUES 
('1', 'success'),
('2', 'authentication failed'),
('3', 'consid and timestamp failed'),
('4', 'signature failed'),
('5', 'authentication failed'),
('6', 'exception failed'),
('201', 'Panjang nomor kartu peserta harus 13 digit'),
('202', 'Nomor kartu peserta harus angka'),
('203', 'Nomor kartu peserta harus diisi'),
('204', 'Nomor kartu peserta tidak ditemukan di masterfile'),
('205', 'authentication failed'),
('206', 'authentication failed'),
('207', 'Data gagal disimpan. Silahkan coba beberapa saat lagi'),
('208', 'Hari debet hanya boleh antara 1 - 28'),
('209', 'Status aktif hanya boleh 1 atau 0. 1 apabila aktif dan 0 apabila tidak aktif'),
('210', 'Peserta sudah terdaftar autodebet'),
('211', 'Peserta sudah terdaftar autodebet di Bank lain'),
('212', 'Peserta sudah pernah terdaftar autodebet namun sudah dinonaktifkan. Silahkan update data peserta'),
('213', 'Peserta belum terdaftar autodebet'),
('214', 'Nomor rekening harus angka'),
('215', 'Nomor handphone harus angka');
