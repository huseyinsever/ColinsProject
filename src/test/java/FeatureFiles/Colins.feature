Feature: Colins Web Uygulaması
  Scenario: Colins Web Uygulamasının Test Otomasyonu
    Given Colins Web sitesine gidin
    When  Colins hesabıyla giriş yapın
    When  Kategorilerden Erkek bölümüne tıklayın
    When  Çıkan ekrandan Cinsiyet bölümünden Erkek e tıklayın
    When  Kategori bölümünden Pantolon a tıklayın
    When  Renk bölümünden Lacivert i seçin
    When  Beden bölümünden S yi seçin
    When  Fit bölümünden Normal Kesimi seçin
    When  Paça Tipi bölümünden Düz Paça yı seçin
    When  Filtreleme bölümündeki tüm seçeneklerin olduğunu doğrulayın
    When  Çıkan Sonuçlardan ilk ürüne tıklayın
    When  Sepete Ekleye tıklayın
    When  Çıkan Bedenden M ye tıklayın
    When  Sepete Tıklayın
    When  Ürünün sepete geldiğini doğrulayın
    When  Ürünün sepetten silin
    When  Sepette ürünün olmadığını doğrulayın
    When  Hesabınızdan çıkış yapın
