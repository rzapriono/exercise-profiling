# Tutorial 5 Advanced Programming
__Reza Apriono__ </br>
__2206827945__</br>
__AdPro B - KVN__</br>

## Performance Testing
### Hasil JMeter Sebelum Profiling
#### JMeter GUI
- /all-student
![all-student gui before profiling](https://media.discordapp.net/attachments/1095957334049693718/1217050759162626109/image.png?ex=66029dd8&is=65f028d8&hm=c11e18647e4cb6a1c6c62c30e5dbf98baad71e311d4e443abe8643d22745c78f&=&format=webp&quality=lossless&width=1662&height=889)
- /all-student-name
![all-student-name gui before profiling](https://media.discordapp.net/attachments/1095957334049693718/1217151276324880474/image.png?ex=6602fb75&is=65f08675&hm=fc74a8bcf7a85423d81eb04342fb9bfdc3e88e0b6a5581417a7c2396c6a7fb2f&=&format=webp&quality=lossless&width=1669&height=889)
- /highest-gpa
![highest-gpa gui before profiling](https://media.discordapp.net/attachments/1095957334049693718/1217152068897341508/image.png?ex=6602fc32&is=65f08732&hm=784336bcd6ad83ef2860aaf5c85d4c0cb893f05db635bd13185cc44a80d92111&=&format=webp&quality=lossless&width=1665&height=889)

#### JMeter CLI
- /all-student
![all-student cli before profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194347745771561/image.png?ex=66032392&is=65f0ae92&hm=2de4bac738538a6dc6936c97b61c44b2d5d9345becaa3d74ad1239808df7fffa&)
- /all-student-name
![all-student-name cli before profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194378062463097/image.png?ex=6603239a&is=65f0ae9a&hm=e96cc5cff55c34a4db45e7ed7e442e89ebed184ee222bd0b83d5101d6cdacf38&)
- /highest-gpa
![highest-gpa cli before profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194413512458451/image.png?ex=660323a2&is=65f0aea2&hm=334b4ff95c3487017747c55b38259e331d41dc80cf621b8981cf548d276419bc&)

### Hasil JMeter Setelah Profiling
#### JMeter GUI
- /all-student
![all-student gui after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217192222600986634/image.png?ex=66032198&is=65f0ac98&hm=ff6a1d9aabbdb9516684f9599bd1e9e056633eebff3edb379ad6106bf9f429a6&)
- /all-student-name
![all-student-name gui after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217190766951137290/image.png?ex=6603203d&is=65f0ab3d&hm=5a051c717e8831c5191b8975281c8ae782c34f5fe55ae7b207b2f5013aa31e5e&)
- /highest-gpa
![highest-gpa gui after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217191163484831864/image.png?ex=6603209b&is=65f0ab9b&hm=298b33b6d70b88c8c6311fdc826864ad2c344cbf6094ded02409f0a9d0e02b94&)

#### JMeter CLI
- /all-student
  ![all-student cli after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194546622890024/image.png?ex=660323c2&is=65f0aec2&hm=55128f46d2b52d24ed5482462518d765b4fb779545e03d928916a2eb7545f8a0&)
- /all-student-name
  ![all-student-name cli after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194582836772934/image.png?ex=660323ca&is=65f0aeca&hm=fe8eb134fe9074f6d977edd9b763b9625267fa7c9d04298d99ab88754c6e56b9&)
- /highest-gpa
  ![highest-gpa cli after profiling](https://cdn.discordapp.com/attachments/1095957334049693718/1217194608854040616/image.png?ex=660323d1&is=65f0aed1&hm=8bfa1914e7528a8ab5d8ac5341c2e033159bdd93be10278bb918b221aa2d399c&)

### Kesimpulan
Setelah menyelesaikan proses pengoptimalan performance dan melakukan performance testing menggunakan JMeter dan juga melakukan profiling, dapat terlihat peningkatan performance yang signifikan dari program yang saya buat. Hal ini dibuktikan dengan menurunnya waktu yang dibutuhkan program untuk merespon terhadap suatu request. Selain itu, dari IntelliJ Profiler terlihat juga bahwa execution time method-method pada program saya menurun cukup drastis dibandingkan dengan saat sebelum melakukan optimalisasi pada kode program.

## Reflection
1. JMeter digunakan untuk menguji peforma di tingkat sistem. Penggunaan JMeter mensimulasikan banyak pengguna dan berbagai jenis load dengan mengirim request ke endpoint yang telah ditentukan dan kemudian mengecek apakah request tersebut dapat dijalankan dan mendapat response. Sementara itu, profiling menyediakan analisis runtime dan execution time dari kode dan memberikan gambaran menyeluruh tentang apa yang terjadi di dalam program. Selain itu, profiling menyediakan informasi yang lebih terperinci tentang program. Hal ini dapat membantu untuk mengidentifikasi hot spot, mengoptimalkan kode, dan memahami perilaku program saat runtime karena profiler dapat mengidentifikasi bagian program yang membutuhkan waktu yang lebih lama untuk dieksekusi dibanding yang bagian yang lain.
<br></br>
2. Profiling membantu saya untuk mengidentifikasi weak spot dan bottleneck dari program berdasarkan informasi runtime, cpu usage, atau memory usage. Dengan demikian, saya dapat membuat keputusan yang tepat tentang di mana harus memfokuskan upaya pengoptimalan kode pada program agar dapat meningkatkan performance dari bagian tersebut dan juga programnya secara keseluruhan
<br></br>
3. Ya, Intellij Profiler menurut saya efektif untuk membantu menganalisis dan mengidentifikasi bottlenecks dari kode program saya. Misalnya, saya dapat mengetahui bahwa method getAllStudentWithCourse membutuhkan waktu yang paling banyak untuk dieksekusi. Berdasarkan informasi tersebut, saya bisa mengetahui method mana yang paling berpengaruh pada performance dari program sehingga membantu saya untuk menganalisis dan mengidentifikasi bottleneck sehingga bisa dilakukan optimasi kode pada program untuk meningkatkan performance.
<br></br>
4. Tantangan terbesar yang saya hadapi dalam melakukan performance testing dan profiling adalah dalam mengalisis dan memahami hasil dari JMeter dan juga Intellij Profiler yang menurut saya datanya agak kompleks karena profiler tidak hanya mengukur method yang saya buat namun juga mengukur method-method yang ada di library, sehingga terkadang agak sulit untuk menentukan kode mana yang paling menghambat performance dari program. Untuk mengatasinya, saya mencoba untuk menganalisis dan memahami hasil Jmeter dan IntelliJ Profiler dengan lebih saksama.
<br></br>
5. Manfaat utama yang saya rasakan dengan menggunakan IntelliJ Profiler untuk melakukan profiling adalah saya bisa menemukan kode yang masih dapat dioptimalkan dengan lebih cepat. Jika tidak menggunakan profiling, saya harus mencari tahu kode mana yang menghambat performance dengan membaca semua kode satu per satu dan bisa saja perbaikan yang ditemukan hanya berdampak sedikit terhadap performa karena optimalisasi dilakukan bukan pada bagian kode yang memakan waktu paling lama untuk dieksekusi.
<br></br>
6. Untuk menangani situasi dimana hasil dari profiling yang tidak sepenuhnya konsisten dengan hasil dari JMeter, saya melakukan dan membuat lebih banyak performance testing pada JMeter dan juga menghindari benchmark menggunakan hasil performance test yang pertama kali saat program berjalan karena JIT compiler pada JVM belum sepenuhnya optimal sehingga menjadi lebih lambat.
<br></br>
7. Setelah menganalisis hasil dari performance testing dan profiling, pertama-tama saya mengidentifikasi titik-titik bottleneck yang memberikan kontribusi terbesar terhadap penurunan performance secara keseluruhan. Kemudian, saya akan mencoba mengoptimalkan bagian kode yang telah teridentifikasi memperlambat performance dengan cara melakukan refactoring untuk meningkatkan efisiensinya. Setelah itu, saya akan melakukan performance testing dan profiling kembali untuk mengecek apakah performance sudah mengalami peningkatan.
<br> Untuk memastikan bahwa perubahan yang diterapkan tidak berpengaruh pada fungsionalitas program, saya memastikan outputnya sekarang sama dengan output sebelum kode tersebut diubah atau output yang seharusnya dengan cara membuat dan menjalankan unit test.