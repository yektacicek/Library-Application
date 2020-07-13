# Library-Application
Sunucu-istemci mimarisi ve görüntü işleme algoritmaları kullanılarak kütüphane sisteminin bir uygulamasının geliştirilmesi

1- Yönetici (Admin) Girişi: Kitap ekleme, zaman atlama ve kullanıcı listeleme arayüzlerini kullanır.
a) Kitap ekleme: Kitabın adı ve ISBN numarasının göründüğü resim yönetici tarafından girilir. Sistem görüntü işleme algoritmalarını kullanarak resimden ISBN numarasını alır ve veri tabanına kayıt işlemini gerçekleştirir.
b) Zaman atlama: Zaman atla modülünde sistem zamanı girilen zamana ötelenir.
c) Kullanıcı listeleme: Tüm kullanıcılar ve üzerinde bulunan kitapların listelenir.

2- Kullanıcı (User) Girişi: Kitap arama, kitap alıp verme arayüzlerini kullanır.
a) Kitap arama: Kitabın ismine ya da ISBN numarasına göre arama yapılabilir.
b) Kitap Alma: Kitap 1 haftalık süre ile kullanıcının üstüne atanır. Başkasının üstünde bulunan kitap sistem tarafından verilemez. Kullanıcı üstünde en fazla 3 kitap bulunabilir. Kullanıcının üzerinde teslim tarihi geçmiş kitap var ise kullanıcı başka kitap alamaz. Yeni kitap alabilmesi için teslim tarihi geçmiş tüm kitapları sisteme geri vermelidir.
c) Kitap Verme: Kullanıcı kitabın ISBN sisteme girer. Sistem ISBN numarasını ve kullanıcının üzerinde bulunan kitaplardaki ISBN numarasını karşılaştırır. Eşleştirme bulursa kitap sisteme geri verilir ve kullanıcının üstündeki kitap bilgileri güncellenir.

3- Veri tabanı (Database): Kullanıcı bilgileri, kitap bilgileri, hangi kitabın kimde olduğuna dair kayıt bilgileri, zaman bilgilerini tutar.
