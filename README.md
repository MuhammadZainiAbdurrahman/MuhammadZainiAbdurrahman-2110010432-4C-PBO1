# MuhammadZainiAbdurrahman-2110010432-4C-PBO1
Proyek Akhir PBO 1
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Rumah`, `RumahDetail`, dan `RumahBeraksi` adalah contoh dari class.

```bash
public class RumahBeraksi { 
public class Rumah {
public class RumahDetail {
```

2. **Object** adalah instance dari class. Pada kode ini, `rumahArray[i] = new RumahDetail(jenis, luas, alamat); adalah contoh pembuatan object.

```bash
rumahArray[i] = new RumahDetail(jenis, luas, alamat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `jenis,luas` dan `alamat` adalah contoh atribut.

```bash
String jenis;
int luas;
String alamat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Rumah` dan `RumahDetail`.

```bash
public Rumah(String jenis, int luas, String alamat) {
        this.jenis = jenis;
        this.luas = luas;
        this.alamat = alamat;
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setjenis``setLuas` dan `setAlamat` adalah contoh method mutator.

```bash
    // Mutator (Setter) untuk atribut jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Mutator (Setter) untuk atribut luas
    public void setLuas(int luas) {
        this.luas = luas;
    }

    // Mutator (Setter) untuk atribut alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `setjenis``setLuas` dan `setAlamat`  adalah contoh method accessor.

```bash
    // Accessor (Getter) untuk atribut jenis
    public String getJenis() {
        return jenis;
    }

    // Accessor (Getter) untuk atribut luas
    public int getLuas() {
        return luas;
    }

    // Accessor (Getter) untuk atribut alamat
    public String getAlamat() {
        return alamat;
    }
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `jenis,luas` dan `alamat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
public class Rumah {
    // Atribut dan Encapsulation
    private String jenis;
    private int luas;
    private String alamat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `RumahDetail` mewarisi `Rumah` dengan sintaks `extends`.

```bash
public class RumahDetial extends Rumah {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
ublic void displayInfo() {
    System.out.println("Jenis Rumah: " + jenis);
    System.out.println("Luas Rumah: " + luas + " m2");
    System.out.println("Alamat Rumah: " + alamat);
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
public String getFasilitas() {
    switch (getJenis().toLowerCase()) {
        case "type a":
            return "Kolam Renang";
        case "type b":
            return "Taman Bermain";
        default:
            return super.getFasilitas();
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
  for (int i = 0; i < rumahArray.length; i++) {
                System.out.println("Masukkan data rumah ke-" + (i + 1));
                System.out.print("Jenis Rumah: ");
                String jenis = scanner.nextLine();
                System.out.print("Luas Rumah: ");
                int luas = Integer.parseInt(scanner.nextLine());
                System.out.print("Alamat Rumah: ");
                String alamat = scanner.nextLine();

                rumahArray[i] = new RumahDetail(jenis, luas, alamat);
            }

    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
  for (int i = 0; i < rumahArray.length; i++) {
                System.out.println("Masukkan data rumah ke-" + (i + 1));
                System.out.print("Jenis Rumah: ");
                String jenis = scanner.nextLine();
                System.out.print("Luas Rumah: ");
                int luas = Integer.parseInt(scanner.nextLine());
                System.out.print("Alamat Rumah: ");
                String alamat = scanner.nextLine();

                rumahArray[i] = new RumahDetail(jenis, luas, alamat);
            }

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `rumahArray[i] = new RumahDetail(jenis, luas, alamat);` adalah contoh penggunaan array.

```bash
rumahArray[i] = new RumahDetail(jenis, luas, alamat);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `catch` untuk menangani error.

```bash
 catch (NumberFormatException e) {
            System.out.println("Kesalahan format input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Zaini Abdurrahman  
NPM: 2110010432
