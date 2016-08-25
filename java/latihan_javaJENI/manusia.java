class Manusia{
  String nama;
  //membuat objek Manusia
  Manusia orang = new Manusia();
  //mengubah nama objek Manusia
  orang.nama = "EKo Kurniawan";
  //mengambil nilai dari fungsi
  String nama = orang.ambilNama();

  String ambilNama(){
    //untuk mengemabalikan nilai gunakan kata kunci return
    return nama;
  }
  //prosedur
  void hapusNama(){
    nama = "";
  }
}
