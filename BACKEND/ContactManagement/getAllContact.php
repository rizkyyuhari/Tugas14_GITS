<?php
require("koneksi.php");
$perintah = "SELECT * FROM tbl_contact_management";
$eksekusi = mysqli_query($konek, $perintah);
$cek = mysqli_affected_rows($konek);

if($cek > 0){
    $response["kode"] = 1;
    $response["pesan"] = "Data Tersedia";
    $response["data"] = array();

    while($take = mysqli_fetch_object($eksekusi)){
        $F["id"] = $take->id;
        $F["nama"]= $take->nama;
        $F["telepon"]= $take->telepon;
        $F["email"] =$take->email;

        array_push($response["data"], $F);
    }

}
else{
    $response["kode"] = 0;
    $response["pesan"] = "Data Tidak Tersedia";
}
echo json_encode($response);
mysqli_close($konek);
