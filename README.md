# Survival Zombie — Belajar Java Lewat Studi Kasus

Repo ini berisi satu proyek game survival ringan (survivor melawan zombie) yang **dibangun bertahap dalam 9 tahap**. Tiap tahap menambahkan **satu konsep Java** ke proyek yang sama, jadi kamu bisa lihat langsung kenapa sebuah konsep itu dibutuhkan, bukan cuma hafal definisinya.

Isi repo ini mengikuti **Materi 04 — Bahasa Pemrograman Java**. Pakai repo ini untuk latihan setelah (atau sambil) membaca materinya.

> Dunia, karakter, dan nama di proyek ini orisinal untuk keperluan belajar, tidak berafiliasi dengan franchise game mana pun. Aksinya ringan (tembak dan gigit), tanpa gore.

---

## Mulai dari Sini

### 1. Siapkan alat

- **JDK 8 atau lebih baru.** Cek di terminal:
  ```bash
  javac -version
  java -version
  ```
  Kalau salah satunya muncul *"not recognized"* / *"command not found"*, JDK belum terpasang atau belum masuk ke PATH.
- Terminal/CMD, **atau** IDE (Eclipse, IntelliJ IDEA, VS Code).

### 2. Ikuti alur belajar ini di setiap tahap

1. **Baca** kode di folder tahap tersebut.
2. **Lihat alurnya** di `flowchart.drawio` dan `pseudocode.md` dalam folder yang sama kalau kodenya belum kebayang. Penjelasannya ada di bagian [Flowchart dan Pseudocode](#flowchart-dan-pseudocode).
3. **Tebak** output-nya sebelum dijalankan.
4. **Jalankan**, lalu bandingkan dengan tebakanmu.
5. **Ubah sesuatu** dan lihat apa yang terjadi, terutama kalau compiler mengeluarkan error. Pesan error adalah bagian dari belajar. Ada ide percobaan di bagian [Coba Sendiri](#coba-sendiri).

Kerjakan **berurutan**, karena tiap tahap membangun di atas tahap sebelumnya. Tapi tiap folder berdiri sendiri: bisa dikompilasi dan dijalankan tanpa folder lain.

---

## Peta Materi dan Tahap

| Bagian Materi 04 | Topik | Tahap |
|---|---|---|
| Bagian 1: Pengantar Java | Konsep OOP dan alur kompilasi | 1 sampai 5 |
| Bagian 2: Struktur Program Java | Package, import, interface, class definition | 6 dan 7 |
| Bagian 3: Tipe Data dan Variabel | Tipe primitif, tipe referensi, jenis variabel | 8 dan 9 |

---

## Struktur Folder

```
SurvivalZombieOOP/
├── Tahap1_Class_Object/
├── Tahap2_Inheritance/
├── Tahap3_Encapsulation/
├── Tahap4_Polymorphism/
├── Tahap5_Kompilasi_CMD/
├── Tahap6_Package_Import/
│   ├── SurvivalZombie.java
│   └── paketMakhluk/        Makhluk, Survivor, Zombie, ZombieBiasa, ZombieRaksasa
├── Tahap7_Interface/
│   ├── SurvivalZombie.java
│   ├── paketMakhluk/
│   └── paketSenjata/        Senjata, Pistol, Shotgun, PisauLipat
├── Tahap8_TipeData/
└── Tahap9_Variabel/
```

Tahap 1 sampai 5 hanya punya satu file `SurvivalZombie.java` yang memuat semua class, supaya kamu fokus ke konsepnya dulu. Mulai Tahap 6, setiap class `public` dipisah ke file sendiri di dalam paket.

Selain kode Java, setiap folder tahap juga berisi penjelas alur: `pseudocode.md`, `flowchart.drawio`, dan folder `flowchart_png/` berisi gambar flowchart-nya.

---

## Flowchart dan Pseudocode

Dua file ini membantu kamu memahami **alur** program sebelum (atau sesudah) membaca kodenya.

- **`pseudocode.md`**: kode ditulis ulang dengan bahasa sehari-hari, lengkap dengan hasil yang diharapkan dan gambar flowchart-nya. Bisa langsung dibaca di GitHub.
- **`flowchart_png/`**: gambar flowchart (PNG), satu gambar per halaman. Bisa dibuka tanpa aplikasi apa pun.
- **`flowchart.drawio`**: diagram alur yang bisa diedit. Satu file bisa berisi beberapa halaman (lihat tab di bagian bawah draw.io), misalnya satu halaman untuk `main()` dan satu halaman untuk tiap method penting.

**Cara membuka `flowchart.drawio`** (hanya perlu kalau mau mengedit; untuk sekadar melihat, pakai gambar PNG-nya):

- Buka [app.diagrams.net](https://app.diagrams.net), lalu **File → Open from → Device**.
- Pasang aplikasi **draw.io Desktop**.
- Di VS Code, pasang ekstensi **Draw.io Integration**, lalu klik filenya.

**Arti bentuk dan warna:**

| Bentuk / warna | Artinya |
|---|---|
| Hijau, ujung membulat | Mulai atau selesai |
| Biru | Proses biasa |
| Biru, bergaris ganda di sisi | Memanggil method (isinya ada di halaman lain) |
| Kuning, jajar genjang | Tampil ke layar (output) |
| Oranye, belah ketupat | Percabangan atau perulangan |
| Ungu | Method yang diwarisi dari super-class (Tahap 2) |
| Merah | Pesan error (Tahap 6) |

**Isi halaman tiap tahap:**

| Tahap | Halaman di `flowchart.drawio` |
|---|---|
| 1 | `main()` |
| 2 | `main()` |
| 3 | `main()`, `tembak()`, `terluka(damage)` |
| 4 | `main()`, `serang()` |
| 5 | Alur kompilasi |
| 6 | `main()`, aturan kompilasi |
| 7 | `main()`, `lawan()`, `serang()` senjata |
| 8 | `main()`, `laporanKota()`, primitif vs referensi |
| 9 | `main()`, `new Zombie()`, `hitungDamage()`, jenis variabel |

---

## Tahap demi Tahap

### Tahap 1: Class dan Object
Kenalan dengan `Survivor`: punya atribut (`nama`, `nyawa`) dan method (`terluka()`, `printStatus()`). Dari satu class dibuat dua objek, `rina` dan `dani`.
**Perhatikan:** kedua objek punya `nyawa` sendiri-sendiri. Rina terluka 30, Dani 10, dan keduanya tidak saling memengaruhi.

### Tahap 2: Inheritance
`Survivor` dan `Zombie` sama-sama punya nama dan nyawa, jadi bagian yang sama dipindah ke super-class `Makhluk` dan diwarisi dengan `extends`.
**Perhatikan:** `rina.printStatus()` jalan padahal `printStatus()` tidak ditulis di `Survivor`. Method itu diwarisi dari `Makhluk`.

### Tahap 3: Encapsulation
Atribut dikunci dengan `private`, dan akses hanya lewat method (getter). Sekarang ada aturan: damage harus lebih dari 0, nyawa tidak boleh minus, dan amunisi terbatas.
**Perhatikan:** tembakan ke-4 gagal, dan `terluka(130)` membuat nyawa berhenti di 0, bukan -30. Aturan seperti ini hanya bisa dijaga kalau datanya tidak bisa diubah sembarangan dari luar.

### Tahap 4: Polymorphism
`Zombie` punya method `serang()`, lalu `ZombieBiasa` dan `ZombieRaksasa` menimpanya dengan `@Override`.
**Perhatikan:** di `main`, perulangan hanya memanggil `z.serang()` pada array `Zombie[]`, tapi hasilnya beda untuk tiap zombie. Satu perintah, banyak perilaku.

### Tahap 5: Kompilasi lewat Command Line
Kodenya sama dengan Tahap 4. Yang dipelajari di sini adalah **alurnya**: `SurvivalZombie.java` → `javac` → `SurvivalZombie.class` → `java` → hasil.
**Perhatikan:** setelah `javac`, lihat isi foldernya. Muncul file `.class` untuk **setiap** class, bukan hanya satu.

### Tahap 6: Package, Import, dan Class Definition
Class dipindah ke paket `paketMakhluk` dan dipanggil dari `SurvivalZombie` dengan `import paketMakhluk.*;`.
**Perhatikan:** satu file hanya boleh punya satu class `public`, dan nama file harus sama dengan nama class-nya (`Survivor` → `Survivor.java`). Nama paket juga harus cocok dengan nama folder.

### Tahap 7: Interface
`Senjata` adalah interface yang hanya mendefinisikan **apa** yang harus bisa dilakukan (`serang()`). `Pistol`, `Shotgun`, dan `PisauLipat` mengisi **bagaimana** caranya dengan `implements`.
**Perhatikan:** method `lawan(Zombie target, Senjata senjata)` tidak peduli senjata apa yang dipakai, selama senjata itu mengimplementasikan `Senjata`. Menambah senjata baru tidak perlu mengubah `lawan()`.

### Tahap 8: Tipe Data Primitif dan Referensi
Method `laporanKota()` memakai delapan tipe primitif (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`) plus satu tipe referensi, `String`.
**Perhatikan:** akhiran `L` pada `long` dan `f` pada `float`, serta huruf awal tipe: kecil untuk primitif (`int`), besar untuk referensi (`String`).

### Tahap 9: Variabel Lokal, Instance, dan Static
Tiga jenis variabel dalam satu proyek:

| Jenis | Contoh di kode | Sifatnya |
|---|---|---|
| Static | `jumlahZombie`, konstanta `NYAWA_MAKS` | Satu salinan, dipakai bersama semua objek |
| Instance | `level` | Satu salinan per objek |
| Lokal | `damage` di `hitungDamage()` | Hanya ada selama method berjalan, wajib diberi nilai awal |

**Perhatikan:** `jumlahZombie` bertambah setiap kali `new Zombie(...)` dibuat, sedangkan `level` milik tiap zombie berbeda-beda.

---

## Cara Menjalankan

Buka terminal **di dalam folder tahap** yang mau dijalankan.

**Tahap 1 sampai 5**

```bash
javac SurvivalZombie.java
java SurvivalZombie
```

**Tahap 6**

```bash
# Windows
javac paketMakhluk\*.java SurvivalZombie.java

# Mac / Linux
javac paketMakhluk/*.java SurvivalZombie.java

java SurvivalZombie
```

**Tahap 7 sampai 9**

```bash
# Windows
javac paketMakhluk\*.java paketSenjata\*.java SurvivalZombie.java

# Mac / Linux
javac paketMakhluk/*.java paketSenjata/*.java SurvivalZombie.java

java SurvivalZombie
```

Perhatikan bahwa `java` dijalankan **tanpa** `.java` / `.class`, cukup nama class-nya.

### Output yang Seharusnya Muncul

Kalau hasilmu sama dengan ini, berarti tahapnya sudah jalan dengan benar.

<details>
<summary>Tahap 1</summary>

```
Selamat datang di Survival Zombie
Rina - nyawa: 70
Dani - nyawa: 90
```
</details>

<details>
<summary>Tahap 3</summary>

```
Rina menembak! Sisa amunisi: 2
Rina menembak! Sisa amunisi: 1
Rina menembak! Sisa amunisi: 0
Rina: amunisi habis!
Rina mengisi ulang amunisi
Damage harus lebih dari 0
Rina - nyawa: 0
Zombie Lorong - nyawa: 60
```
</details>

<details>
<summary>Tahap 4</summary>

```
Zombie Baru: menyerang pelan
Zombie Lorong: menggigit! (damage 10)
Raksasa Gudang: membanting! (damage 35)
```
</details>

<details>
<summary>Tahap 7</summary>

```
Selamat datang di Survival Zombie
Zombie Baru: menyerang pelan
Zombie Lorong: menggigit! (damage 10)
Raksasa Gudang: membanting! (damage 35)
DOR! Pistol menembak
Zombie Lorong - nyawa: 80
DUAR! Shotgun menembak
Raksasa Gudang - nyawa: 50
SLASH! Pisau menebas
Zombie Lorong - nyawa: 70
```
</details>

<details>
<summary>Tahap 9</summary>

```
Survival Zombie - nyawa maksimum: 100
Jumlah zombie di kota: 3
Zombie Lorong damage (level 0): 10
Zombie Lorong damage (level 3): 25
DOR! Pistol menembak
Zombie Lorong - nyawa: 80
DUAR! Shotgun menembak
Raksasa Gudang - nyawa: 50
```
</details>

---

## Menjalankan di IDE

Buat **satu Java Project per tahap**.

- **Tahap 1 sampai 5:** cukup satu file `SurvivalZombie.java`.
- **Tahap 6 sampai 9:** buat package `paketMakhluk` (dan `paketSenjata` mulai Tahap 7), lalu isi class-nya dari folder masing-masing. `SurvivalZombie.java` ditaruh di *default package*.

---

## Coba Sendiri

Setelah tiap tahap berjalan, ubah kodenya dan baca pesan error dari compiler. Coba tebak dulu errornya sebelum kamu compile.

- **Tahap 2:** panggil `zombie.tembak()`. Kenapa error?
- **Tahap 3:** akses `rina.nyawa` langsung dari `main`.
- **Tahap 4:** tambah class `ZombieCepat` dan masukkan ke array **tanpa mengubah perulangannya**.
- **Tahap 6:** hapus `public` dari constructor `Zombie`, atau ubah nama file `Survivor.java`.
- **Tahap 7:** buat senjata baru, misalnya `Panah`, lalu pakai di `lawan()`.
- **Tahap 8:** isi `byte` dengan 200, atau `float` tanpa akhiran `f`.
- **Tahap 9:** hapus nilai awal variabel lokal `damage`.

---

## Kalau Ada Error

| Pesan | Kemungkinan penyebab |
|---|---|
| `'javac' is not recognized` / `command not found` | JDK belum terpasang atau belum masuk PATH |
| `class X is public, should be declared in a file named X.java` | Nama file tidak sama dengan nama class `public` |
| `package paketMakhluk does not exist` | Salah folder, atau lupa menyertakan `paketMakhluk\*.java` saat `javac` |
| `Could not find or load main class SurvivalZombie` | `java` dijalankan dari folder yang salah, atau belum dikompilasi |
| `cannot find symbol` | Typo nama variabel/method, atau lupa `import` |
| `has private access in ...` | Kamu mengakses atribut `private` dari luar class. Pakai getter |

---

## Setelah Selesai

Kalau kamu sudah bisa menjelaskan **kenapa** tiap konsep ditambahkan di tahapnya, bukan hanya apa definisinya, berarti kamu sudah paham intinya. Selanjutnya coba kembangkan sendiri: tambah jenis zombie, senjata, atau aturan baru, dengan konsep yang sudah dipelajari di sini.
