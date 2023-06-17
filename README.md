# Pustaka-servlet

*sebelum mengikuti, diharapkan sudah downlaod eclipse EE dan sudah tahu cara instal server tomcat ke dalam eclipse*
*di harapkan untuk uninstal server tomcat yang sudah di instal sebelumnya untuk mempermudah import library karena file tomcat sudah di sediakan di repo*
*sebelum run server, pastikan database berjalan dengan lancar dan tidak ada masalah*

Cara implementasi servlet menggunkan server tomcat di eclipse
//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//

Server tomcat memerlukan banyak import library untuk menjalankan servlet,
kebanyakan error terjadi pada database connectivity dan Jakarta Standard Tag Library (JSTL) juga merupakan akibat dari tidak import library.

Di dalam repo /Library yang aku sediakan sudah di lengkapi dengan import yang di butuhkan untuk menjalankan servlet di eclipse menggunakan server tomcat.

Jangan lupa untuk extract repo yang di downlaod di tempat yang mudah di ingat, karna kemungkinan kedepannya akan sering di modifikasi

Bagi yang sudah tau cara menggunakan Pull di Git kalian bisa Import repo ini langsung dari Eclipse IDE

//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//

Instalasi Step-by-step (downlaod zip)
1. Download repo ini dan extract di dalam folder yang mudah di temukan
2. Buka Eclipse IDE
3. Di Eclipse IDE, pilih Menu>FIle>Open file>(folder tempat extract tadi)>pustakadizznutfile
3. Setelah berhasil import pastikan file pustakadizznut sudah ada di Project explorer eclipse
4. Di project explorer pada eclipse, klik kanan pada pustakadizznut>build path
5. Pilih menu Add external JAR
6. Pergi ke folder tempat kalian extract tadi, pilih /pustakadizznutfile/library/
7. Tambahkan Java connector dan JSTL JAR ke dalam build path project
8. Run server Tomcat
9. Pada Project explorer eclipse, cari pustakadizznut/src/main/webapp/login.jsp
10. Klik kanan pada login.jsp, Run as>server

//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//==//

