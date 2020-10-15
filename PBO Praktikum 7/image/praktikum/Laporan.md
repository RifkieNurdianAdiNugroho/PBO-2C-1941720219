#MARKDOWN
Percobaan 1
B. PERTANYAAN 
1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas! 
Jawab=
SuperClass=Karyawan
SubClass=Manager dan Staff

2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain? 
Jawab= extends

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class 
tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan! 
Jawab=yang dimiliki di Class Manager hanyalah tunjangan
   Dan yang diwarisi dari class Karyawan ialah attribut Gaji yang disitu ada kata super yang berarti 	   diambil dari Class Super atau Karyawan

4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class 
Manager! 
Jawab=attribut super itu diambil dari Gaji yang ada di Class Karyawan yang mana sudah di extends ke Class Manager agar tau kalo telah diextends kan dengan Class Karyawan

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan 
alasannya! 
Jawab=Multilevel Inheritance karena Supernya hanya dari Class karyawan saja bukan dari beberapa Class super.

4. PERCOBAAN 2
6. Berdasarkan class diatas manakah yang termasuk single inheritance 
dan mana yang termasuk multilevel inheritance?
Jawab=
yang memakai single class itu ada pada Class Staff,Staf Tetap dan Staf Harian
Yang memakai multilevel inheritence yaitu yang Classnya mengextends dari Class Karyawan
 
7.Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang 
dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class 
Staff! 
Jawab=
Class StaffTetap memiliki attribut=golongan dan asuransi
Class StaffHarian memiliki attribut=jumlah jam kerja
Yang diwarisi dari Class Staff itu dari attribut lembur dan potongan

8.Apakah fungsi potongan program berikut pada class StaffHarian
Jawab=memanggil attribut-attribut yang ada di Class Staff yang sudah di extends di kelas StaffHarian dan mengapa super 
agar tau darimana dapat attributnya yaitu dari konstruktor Class Staff sebagai Class Super di bagian Staff 

9.Apakah fungsi potongan program berikut pada class StaffHarian
Jawab=gunanya untuk menampilkan inputan yang nanti dikeluarkan dari Class staf dan kenapa ada super karena 
menginisiasi dari Class Staff yang ada construktornya nama,alamat,jk,umur,gaji,lembur dan potongan

10.Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap 
Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses 
langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, 
lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, 
dan potongan? 
Jawab=Karena Class Staff sudah di extendskan dengan kelas Karyawan terlebih dahulu yang dimana ada atrribut gaji disitu lalu di 
Class Staff sudah ada attribut lembur dan potongan dan Class inheritance dari Class Staf yaitu Class StaffHarian dan ClassStafTetap itu kan sudah di extends kan 
dengan Class Staff maka akan bersambung dengan attribut yang sudah diextendskan dari kelas karyawan agar bisa dipakai dikelas yang dibutuhkan
