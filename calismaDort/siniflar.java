package calismaDort;

public class siniflar {

	public static void main(String[] args) {
		//sınıflar
		
		hesapMakinesi maki1 = new hesapMakinesi(3,8,"mavi");//buraya değerleri yazsakta aşağında yeni değerler
		maki1.a = 4;    //verdiğimizde aşağıdaki değerlerimiz ekrana yazılacaktır.
		maki1.b = 3;
		System.out.println(maki1.a);
		
		hesapMakinesi maki2 = new hesapMakinesi(9,4,"yeşil");//parantezin içini doldurmalıyız çünkü constructor
		                                           //tanımladık
	
		System.out.println(maki2.toplama());// toplama constructor umuzu kullanıp sayılarımızı topladık
		System.out.println(maki2.cikarma());
		maki2.a =5; // buradan itibaren yeni maki2 a değerimiz 5 olarak güncellendi.
		System.out.println(maki2.carpma());
	}

}
