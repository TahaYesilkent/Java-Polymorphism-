# Pacific & R&D Car Projects

Bu proje, Java programlama dilinde temel Nesne Yönelimli Programlama (OOP) konseptlerini (Kalıtım, Polymorphism, Encapsulation, Method Overriding) sergilemek üzere tasarlanmış iki ayrı araç geliştirme senaryosunu içermektedir: **Pacific Car Company** ve **Car R&D Company**.

## Proje Amacı

Temel amaç, Java'da sınıf hiyerarşilerini oluşturmak, erişim belirteçlerini (`private`, `protected`, `public`) doğru kullanmak ve `toString()`, `equals()` gibi Object sınıfı metotlarını başarıyla geçersiz kılmaktır.

## Proje Yapısı

Proje, iki ana Java paketi altında organize edilmiştir:

src/
├── org/example/
    ├── arge/
    │   ├── CarSkeleton.java (Ana Sınıf)
    │   ├── GasPoweredCar.java
    │   ├── ElectricCar.java
    │   └── HybridCar.java
    └── company/
        ├── Car.java (Ana Sınıf)
        ├── Mitsubishi.java
        ├── Holden.java
        └── Ford.java
└── Main.java (Test ve Uygulama Sınıfı)


## Teknolojiler ve Konseptler

* **Dil:** Java
* **Kullanılan Konseptler:** Kalıtım, Polymorphism, Method Overriding, Encapsulation, `toString()`, `equals()`.

---

## 1. Pacific Car Company Projesi (Paket: `org.example.company`)

Bu bölüm, temel bir araç (`Car`) sınıfı tanımlar ve üç farklı araç markası (`Mitsubishi`, `Holden`, `Ford`) bu sınıftan kalıtım alır.

### `Car` Sınıfı Detayları:

| Özellik | Tip | Erişim | Açıklama |
| :--- | :--- | :--- | :--- |
| `engine` | `boolean` | `private` | Motorun varlığı (Varsayılan: `true`). |
| `cylinders` | `int` | `private` | Silindir sayısı. |
| `name` | `String` | `private` | Araç adı. |
| `wheels` | `int` | `private` | Tekerlek sayısı (Varsayılan: `4`). |

### Metotlar ve Polymorphism:

`Car` sınıfında tanımlanan `startEngine()`, `accelerate()` ve `brake()` metotları, alt sınıflar tarafından **Override** edilmiştir. Tüm bu metotlar, çağrıldığında `getClass().getSimpleName()` değerini konsola loglayarak hangi sınıfın metodunun çalıştığını açıkça gösterir.

---

## 2. Car R&D Company Projesi (Paket: `org.example.arge`)

Bu bölüm, farklı motor tiplerine sahip araçların iskeletini (`CarSkeleton`) tasarlar ve Polymorphism kullanımını test eder.

### `CarSkeleton` Sınıfı Metotları:

| Metot | Erişim | Açıklama |
| :--- | :--- | :--- |
| `startEngine()` | `public` | Motor çalıştırma. Alt sınıflar kendi motor tiplerine göre Override eder. **Sınıfın tipini ekrana basar.** |
| `runEngine()` | `protected` | Motorun temel çalışma mantığı. Sadece `drive()` metodu içerisinden çağrılır. |
| `drive()` | `public` | Sürüşü başlatır ve içeride `runEngine()` metodunu çağırır. Alt sınıflar Override eder. |

### Alt Sınıflar ve Özellikleri:

| Sınıf | Temel Özellikler | Motor Tipi |
| :--- | :--- | :--- |
| **`GasPoweredCar`** | `avgKmPerLitre`, `cylinders` | Benzinli |
| **`ElectricCar`** | `avgKmPerCharge`, `batterySize` | Elektrikli |
| **`HybridCar`** | `avgKmPerLitre`, `batterySize`, `cylinders` | Hibrit |

Tüm alt sınıflar, kendi motor tiplerine özel mesajlar döndürmek için `startEngine()` ve `drive()` metotlarını geçersiz kılarlar.

---

## Çalıştırma ve Test

Projenin `Main.java` sınıfı, iki bölümdeki gereksinimleri de yerine getiren test kodlarını içerir. Polymorphism kurallarına uygun olarak oluşturulan nesnelerle metotlar çağrılır ve konsol çıktısı ile beklenen davranışlar doğrulanır.

### Test Çıktısından Örnekler:

Testler sırasında elde edilen çıktılar, alt sınıflara atanan üst sınıf referanslarının (örneğin, `Car mitsubishi = new Mitsubishi(...)`) doğru bir şekilde alt sınıfın Override edilmiş metodunu çağırdığını göstermektedir. Ayrıca, `Car R&D Company` testlerinde istenen sınıf tipi loglaması da başarıyla gerçekleştirilmiştir.
