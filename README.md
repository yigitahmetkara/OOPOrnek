OOP Çalışma - Araba Satış ve Müşteri Yönetim Sistemi
Bu proje, Java programlama dili kullanılarak Nesne Yönelimli Programlama (OOP) prensiplerini uygulamalı olarak göstermek amacıyla geliştirilmiştir. Bir araç satış bayisinin temel işleyişini; araç yönetimi, müşteri kayıtları ve satış işlemleri üzerinden simüle eder.

Proje Bileşenleri ve Mimari
Proje, birbirleriyle ilişkili dört temel sınıftan oluşmaktadır:

Araba (Car): Araçların marka, model ve fiyat gibi teknik özelliklerini tutan sınıftır.

Müşteri (Customer): Sistemi kullanan kişilerin kişisel ve iletişim bilgilerini yönetir.

Satış (Sale): Belirli bir aracın, belirli bir müşteriye satış sürecini ve faturalandırma mantığını yönetir.

Test: Sistemin tüm fonksiyonlarını (nesne oluşturma, metot çağırma vb.) denetleyen ana sınıftır.

Uygulanan OOP Kavramları
Encapsulation (Kapsülleme): Veri güvenliği için değişkenlerin private tutulması ve Getter/Setter metotlarının kullanımı.

Sınıf İlişkileri: Nesnelerin birbirleriyle etkileşime girmesi (Örn: Bir satış nesnesinin içinde hem araba hem müşteri nesnesi barındırması).

Metot Yapıları: Dinamik hesaplamalar ve bilgi gösterimi için özelleştirilmiş metotlar.

Teknik Detaylar
Dil: Java

IDE: Eclipse

Sürüm Kontrolü: Git & GitHub

Kurulum
Bu depoyu yerel makinenize klonlayın:

Bash
git clone https://github.com/yigitahmetkara/oopcalisma.git
Eclipse IDE'sini başlatın.

File > Import > General > Existing Projects into Workspace adımlarını izleyerek projeyi seçin.

Test.java dosyasını bularak uygulamayı çalıştırın
