#MARKDOWN
pertanyaan diskusi
Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak 
mengimplementasikan method abstract yang ada di class induknya? Buktikan!
Jawab=tidak boleh karena jika tidak mengimpelementasikan method abstract maka akan terjadi error pada saat extends karena method
abstract harus di implementasikan agar sistem tahu darimana implementasi abstracnya ini.

Pertnyaan
1. Berikan penjelasan terkait tentang jalannya program diatas 
Jawab=pertama kita membuat implementasi kelas abstract dan membuat class yang sebagai parent dari kelas yang
nantinya akan diextends,akan tetapi disini kita harus mengimplimentasikan method abstract tadi agar
kelas yang diturunkan bisa mengimplementasikannya atau fungsi yang meng-override fungsi abstract tadi,
lalu kita bisa membuat method disetiap class yang diturunkan

2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method
bergerak() diubah menjadi method abstract!
Jawab=akan terjadi error karena sudah melakukan implementasi di extends jadi tidak lagi menambah method abstract jika ditambah maka akan terjadi error

3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan 
overriding terhadap method bergerak()
Jawab=akan terjadi error karena tidak adanya pendeklrasian dan juga tidak dapat mewarisi tingkah laku dari kelas parent

4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method
bergerak()yang dideklarasikan dalam Class Ikan
Jawab=maka akan mengeluarkan sesuai method "Berenang dengan Sirip,"wush...wushh..",
karena method ini sudah melakukan implementasi abstract calss dari class parent jadi kita hanya tinggal mengisi menthodnya saja sebagai keluaran dari instansiasi kelas itu tadi.
