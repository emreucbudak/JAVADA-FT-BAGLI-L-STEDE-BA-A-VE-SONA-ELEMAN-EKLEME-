package ciftbagli;

public class Liste {
	Bagli head = null;
	Bagli tail = null;
	void basEkle(int x) {
		Bagli eleman = new Bagli();
		eleman.veri = x;
		if (head ==null && tail == null) {
			System.out.println("Liste boş olduğundan dolayı eleman olarak ekledim");
			head = eleman;
			tail = eleman;
			eleman.next = null;
		}
		else {
			System.out.println("BAŞA EKLENDİ!");
			head = eleman;
			head.prev = eleman;
			eleman.next = head;
		}
	}
	void sonEkle(int y) {
		Bagli eleman2 = new Bagli();
		eleman2.veri = y;
		if (head == null && tail == null) {
			System.out.println("Liste boş oldugundan dolayı tek eleman olara kekledim");
			head = eleman2;
			tail = eleman2;
			eleman2.next = null;
			
		}
		else {
			tail.next = eleman2;
			tail = eleman2;
			eleman2.prev = tail;			
			System.out.println("Sona Ekleme Başarılı!");

		}
		
	}
	void yazdir() {
		Bagli ref = head;
		if (head == null) {
			System.out.println("Liste Boş kanka");
		}
		else {
			while (ref != null) {
				System.out.println("------->>>>>" + ref.veri);
				ref = ref.next;
			}
		}
	}
}
