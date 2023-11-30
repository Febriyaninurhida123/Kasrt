# Praktikum 9: PHP Modular

## Instruksi Praktikum
1. Persiapkan text editor misalnya VSCode. 2. Buat folder baru dengan nama lab9_php_modular pada docroot webserver
(htdocs)
3. Ikuti langkah-langkah praktikum yang akan dijelaskan berikutnya. 

## Langkah-langkah Praktikum
Buat file baru dengan nama header.php
```
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Contoh Modularisasi</title>
<link href="style.css" rel="stylesheet" type="text/stylesheet"
media="screen" />
</head>
<body>
<div class="container">
<header>
<h1>Modularisasi Menggunakan Require</h1>
</header>
<nav>
<a href="home.php">Home</a>
<a href="about.php">Tentang</a>
<a href="kontak.php">Kontak</a>
</nav>
```
![image](ss/ss1.png)

Buat file baru dengan nama footer.php
```
<footer>
<p>&copy; 2021, Informatika, Universitas Pelita Bangsa</p>
</footer>
</div>
</body>
</html>
```
![image](ss/ss2.png)


Buat file baru dengan nama home.php
```
<?php require('header.php'); ?>
<div class="content">
<h2>Ini Halaman Home</h2>
<p>Ini adalah bagian content dari halaman.</p>
</div>
<?php require('footer.php'); ?>
```
![image](ss/ss3.png)


output :
![image](ss/ss6.png)



Buat file baru dengan nama about.php
```
<?php require('header.php'); ?>
<div class="content">
<h2>Ini Halaman About</h2>
<p>Ini adalah bagian content dari halaman.</p>
</div>
<?php require('footer.php'); ?>
```

![image](ss/ss4.png)


output :

![image](ss/ss7.png)



## berikut struktur yang saya buat :
├── config
│   ├── hapus.php
│   ├── koneksi.php
│   ├── tambah.php
│   └── ubah.php
├── layouts
│   ├── footer.php
│   ├── head-static.php
│   ├── header.php
│   ├── main.php
│   ├── tambah.php
│   └── ubah.php
├── static
│   ├── css
│   │   └── style.css
│   └── img
├── index.php
├── tambah.php
└── ubah.php

### config
Dalam folder tersebut menyimpan file khusus php yang nanti akan dieksekusi

* koneksi.php
![image](ss/ss8.png)

* tambah.php
![image](ss/ss9.png)

* ubah.php
![image](ss/ss10.png)

* hapus.php
![image](ss/ss11.png)

### Layouts
Untuk menyimpan tampilan utama pada website, dan dibagi pada beberapa file

* head-static.php
![image](ss/ss12.png)

* header.php
![image](ss/ss14.png)

* main.php
![image](ss/ss15.png)

* footer.php
![image](ss/ss13.png)


### Static
Untuk menyimpan file yang diperlukan seperti css, js, gambar

* style.css
![image](ss/ss16.png)


### Index.php, tambah.php, ubah.php
File utama dan berfungsi sebagai wadah untuk memanggil sub-file di beberapa direktori

* index.php 
![image](ss/ss17.png)

* tambah.php
![image](ss/ss18.png)

* ubah.php
![image](ss/ss19.png)

### Output
Data Barang:
![image](ss/ss20.png)

Tambah barang:
![image](ss/ss21.png)


setelah ditambahkan data jadi bertambah,
![image](ss/ss22.png)


ubah barang:
![image](ss/ss23.png)

saya mengubah stok yang tadinya 5 jadi 1:
![image](ss/ss24.png)

hapus barang:
![image](ss/ss25.png)

setelah dihapus data barang jadi tinggal 3