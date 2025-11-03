Penjelasan Program
Soal 1 – Menghitung Ongkir Paket

Fungsi:
Program menghitung ongkos kirim berdasarkan jumlah paket, jarak pengiriman, dan ukuran paket.

Cara kerja:

Pengguna memasukkan jumlah paket dan jarak pengiriman.

Jika jarak ≤ 10 km, ongkir per paket adalah 4.250. Jika lebih dari 10 km, ongkir per paket menjadi 6.000.

Pengguna diminta mengisi ukuran paket (panjang, lebar, tinggi) untuk menghitung volume.

Jika volume paket > 100 cm³, dikenakan biaya tambahan sebesar 50.000 per paket.

Total ongkir = ongkir dasar + biaya tambahan (jika ada).

Program menampilkan total biaya kirim.

Contoh hasil
![soal 1](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210440.png?raw=true)

Soal 2 – Menentukan Bilangan Ganjil atau Genap

Fungsi:
Menentukan apakah bilangan yang dimasukkan pengguna termasuk bilangan genap atau ganjil.

Cara kerja:

Pengguna memasukkan sebuah bilangan.

Program memeriksa apakah bilangan habis dibagi 2 menggunakan operator modulus (%).

Jika hasilnya 0, maka bilangan genap. Jika tidak, bilangan ganjil.

Hasil ditampilkan ke layar.

Contoh hasil
![soal 2](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210537.png?raw=true)

Soal 3 – Menghitung Faktorial

Fungsi:
Menghitung hasil faktorial dari sebuah bilangan.

Cara kerja:

Pengguna memasukkan satu bilangan.

Program menggunakan perulangan while untuk mengalikan angka dari 1 hingga bilangan tersebut.

Setiap kali perulangan, hasil dikalikan dengan nilai variabel penghitung.

Setelah selesai, hasil akhir ditampilkan sebagai nilai faktorial.

Contoh hasil 
![soal 3](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210558.png?raw=true)

Soal 4 – Menghitung Volume Tabung

Fungsi:
Menghitung volume tabung berdasarkan jari-jari dan tinggi.

Cara kerja:

Pengguna memasukkan jari-jari dan tinggi tabung.

Program menghitung luas alas (r²) menggunakan Math.pow(jari, 2).

Nilai π (pi) diambil dari Math.PI.

Rumus volume tabung = π × r² × t.

Hasil perhitungan ditampilkan ke layar.

Conoth hasil
![soal 4](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210624.png?raw=true)

Soal 5 – Menghitung Rata-Rata Nilai Siswa

Fungsi:
Menghitung rata-rata nilai dari sejumlah siswa.

Cara kerja:

Pengguna memasukkan jumlah siswa.

Program menggunakan perulangan while untuk meminta input nilai dari setiap siswa.

Semua nilai dijumlahkan ke dalam variabel total.

Setelah semua nilai dimasukkan, rata-rata dihitung dengan rumus total / jumlah siswa.

Nilai rata-rata ditampilkan ke layar.

Contoh hasil
![soal 5](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210703.png?raw=true)

Soal 6 – Penjumlahan Dua Matriks

Fungsi:
Menjumlahkan dua matriks berukuran sama.

Cara kerja:

Pengguna memasukkan jumlah baris dan kolom matriks.

Program membuat tiga array 2 dimensi (matriks1, matriks2, dan hasil).

Pengguna mengisi elemen untuk kedua matriks.

Program menjumlahkan elemen-elemen yang sama posisinya:

hasil[i][j] = matriks1[i][j] + matriks2[i][j];


Matriks hasil ditampilkan ke layar.

Contoh hasil
![soal 6](https://github.com/Muhammad-Haidar27/latihan-soal-ukl/blob/main/Screenshot%202025-11-03%20210808.png?raw=true)
