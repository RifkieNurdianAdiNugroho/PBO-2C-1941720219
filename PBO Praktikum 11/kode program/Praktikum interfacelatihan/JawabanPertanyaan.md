#Markdown
pertanyaan Percobaan 1
1.Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. 
Jelaskan penyebab terjadinya hal tersebut ?
Jawab=penyebabnya karena class interface ICumlaude yang berada pada satu package

2.Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut 
dihilangkan? Jelaskan menurut pemahaman anda.
Jawab=akan mengeluarkan build succesfull karena tidak ada intansiasi dari class-class yang dipanggil.

3.Mengapa pada langkah nomor 9 terjadi error? Jelaskan!
Jawab=Karena dari class mahasiswa belum melakukan implements ke class interface ICumlaude

4.Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class
Program? Mengapa demikian?
Jawab=terjadi error,karena bukan dalam bagian implementasi karena method kuliahDiKampus merupakan bagian dari class mahasiswa

5.Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method 
beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
Jawab=tidak bisa karena bukan dalam bagian implementasi,karena method tersebut berada dalam class mahasiswa bukan kedalam method hasil implements

6.Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi 
class Program menjadi seperti berikut ini:
Jawab=Tinggal menambhan saja System.out.printlns pada class Sarjana dan PascaSarjana denngan value yang dinginkan di daerah method lulus

PRAKTIKUM MULTIPLE
F. PERTANYAAN PERCOBAAN 2 
1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar 
dibawah ini :(diubah menjadi protected)
Jawab=terjadi error karena tidak diperbolehan untuk menjadi protected,jika digunakan protected maka tidak bisa mengimplement ke class yang lain

2.Jelaskan menurut anda, mengapa hasil dari script code tersebut error ?
Jawab=karena classnya adalah abstract jadi tidak bisa di instansisasi ke dalam main

3.Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan 
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait 
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat 
mawapres pada objek sarjanaCumlaude
Jawab= pertama menambahkan implements pada class Sarjana dan Prasarjana yang sebelumnya pada class abstract IBerprestasi sudah
ada method menjuaraiKompetisi dan MembuatPublikasiIlmiah lalu di implementasikan dan diisi setiap method tersebut dengan value yang dinginkan
