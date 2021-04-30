# Movie Project

## Splash Screen
Splash screen adalah istilah yang diberikan pada layar pembuka setiap kali kita menjalankan sebuah aplikasi Android. Splash Screen digunakan untuk load data,  menjalankan file konfigurasi, dan proses suatu algoritma tertentu. 

## API
API (Aplication Programming Interface) adalah antarmuka aplikasi yang memungkinkan dua atau lebih program aplikasi untuk saling berkomunikasi satu sama lain.

[] Peranan dan Kegunaan API

- API berperan sebagai perantara antar berbagai aplikasi berbeda, baik dalam satu platform yang sama atau lintas platform.
- API juga digunakan untuk komunikasi dengan berbagai bahasa pemrograman yang berbeda.
- Dengan API developer tidak perlu menyediakan semua data sendiri karena cukup mengambil data yang dibutuhkan dari platform lain melalui API.
- API juga memungkinkan untuk mengembangkan sebuah website dengan berbagai fitur yang lebih lengkap.

[] Manfaat API

- Memudahkan Membangun Aplikasi yang Fungsional.
- Meringankan Beban Server.
- Pengembangan Aplikasi Menjadi Lebih Efisien.

[] Cara Kerja API

- Aplikasi mengakses API.
- API Melakukan Request ke Server.
- Server Memberi Respon ke API.
- API Menyampaikan Respon ke Aplikasi.

[] Tujuan Utama API

Tujuan dari API adalah untuk mempercepat pembuatan suatu aplikasi karena programmer tidak perlu menulis kode dari nol. API juga disediakan oleh sebuah platform untuk dapat mengakses fitur dari platform tersebut. 
Contoh dari API yang lintas platform adalah API Twitter dan Facebook, yang memungkinkan kita untuk dapat mengakses data pengguna platform tersebut pada aplikasi kita. [ Baca Selengkapnya...](https://www.niagahoster.co.id/blog/api-adalah/?amp)
 
## REST API

REST merupakan kependekan dari Representational State Transfer. REST API merupakan salah satu dari desain arsitektur yang terdapat di dalam API itu sendiri. REST adalah salah satu implementasi dari web service sebagai sebuah standar yang digunakan untuk pertukaran data antar aplikasi atau sistem.
REST ini bersifat client dan server. Prinsip kerja dari REST API ini adalah client akan menganggap server sebagai object yang dapat dibuat, diupdate, dihapus dan juga dibaca. Jadi pada pelaksanaannya akan ada create dengan request POST, update dengan request PUT atau PATCH, hapus dengan request DELETE, dan baca dengan request GET.

[] Cara Kerja

- REST client akan mengakses data/resource ke REST server dimana masing-masing resource atau data tersebut dibedakan oleh sebuah global ID atau URIs (Universal Resource Identifiers).
- Data yang diberikan oleh REST server itu bisa berupa format text, JSON atau XML. Yang paling populer dipakai saat ini adalah format JSON.
- REST ini memiliki standarisasi dalam pemakaian yaitu mengenai URL dan HTTP verbs.

[] Standarisasi HTTP verbs

- GET: untuk membaca sebuah record atau daftar record.
- POST: untuk menambah sebuah record.
- PUT: untuk mengupdate semua field dalam sebuah record.
- PATCH: untuk mengupdate beberapa field dalam sebuah record.
- DELETE: untuk menghapus sebuah record.

[] Kelebihsan REST API

- Bisa digunakan oleh banyak bahasa pemroggraman dan banyak platform.
- Lebih simple dibandingkan dengan SOAP.
- Mudah dipelajari.
- Menggunakan protokol HTTP, dan HTTP ada dimana-mana.

## Retrofit

Retrofit adalah sebuah library android yang membantu pengembang untuk melakukan request ke sebuah endpoint REST API. Library ini dikembangkan oleh Square Inc(https://github.com/square) sebuah perusahaan yang berbasis di Amerika Serikat. 

Retrofit digunakan untuk mempermudah aplikasi android kita mengambil data dari API server. Dengan menggunakan Retrofit kita lebih mudah untuk melakukan request melalui HTTP. Request yang disediakan Retrofit ada lima yaitu GET, POST, PUT, DELETE, dan HEAD. [ Baca Selengkapnya...](https://polinema-mobile.github.io/jobsheet/11-rev.html)

[] kegunaan Library 
- Menyederhanakan kode program yang digunakan untuk mengakses REST API. Seperti mengakses REST API dengan proses sederhana (GET, POST, PUT, DELETE) retrofit juga.
- Mendukung berbagai macam format authentikasi via http, menambahkan header pada request, menambahkan parameter serta mengirim data berupa image ke server.
- Memudahkan untuk mengambil dan mengunggah JSON (atau struktur data lainnya) melalui webservice berbasis REST.
- Mengonfigurasi konverter mana yang digunakan untuk serialisasi data.
- Menambahkan konverter khusus untuk memproses XML atau protokol lain.

## Penerapan Dan Tampilan Aplikasi


1. Splash Screen
- Splash screen akan muncul di layar pembukan setiap pengguna jika ingin mengoperasikan aplikasinya.

![WhatsApp Image 2021-04-30 at 18 18 23](https://user-images.githubusercontent.com/60412314/116707180-93b49100-a9f8-11eb-9bcf-0e75f9db3487.jpeg)

(Perpindahan antara halaman Splash Screen dengan Intro Slide menggunakan Intent).





2. Halaman Utama dengan Penerapan API, REST API, Retrofit
- Menampilkan list film dan menggunakan fitur scroll bar.

![WhatsApp Image 2021-04-30 at 18 18 23 (1)](https://user-images.githubusercontent.com/60412314/116707185-957e5480-a9f8-11eb-8a63-a2619db8fec2.jpeg)

![WhatsApp Image 2021-04-30 at 18 18 23 (2)](https://user-images.githubusercontent.com/60412314/116707189-96af8180-a9f8-11eb-9a08-3005c7aff34d.jpeg)


## Jalannya Aplikasi

![WhatsApp Video 2021-04-30 at 21 45 36](https://user-images.githubusercontent.com/60412314/116712379-ffe5c380-a9fd-11eb-94dd-cd450a1837e3.gif)

# Terimakasih :)




