<?php
require("koneksi.php");

$response = array();

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    $nama = $_POST["nama"];
    $telepon = $_POST["telepon"];
    $email = $_POST["email"];

    $perintah = "INSERT INTO tbl_contact_management (nama,telepon,email) VALUES('$nama','$telepon','$email')";
    $eksekusi = mysqli_query($konek, $perintah);
    $cek  = mysqli_affected_rows($konek);

    if($cek > 0){
        $response["kode"] = 1;
        $response["pesan"] = "Simpan Data Berhasil";
    }
    else {
        $response["kode"] = 0;
        $response["pesan"] = "Gagal Menyimpan Data";
        
    }
    
}
else{
    $response["kode"] = 0;
    $response["pesan"] ="Tidak ada Post Data";
}

echo json_encode($response);
mysqli_close($konek);