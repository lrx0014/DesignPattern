package h21_Mediator;

public class Client {
	public static void main(String args[]) {

		WTO wto = new WTO();

		China cn = new China();

		America us = new America();

		wto.setChina(cn);

		wto.setAmerica(us);

	}
}

// ����ͬ��

class America extends Country {

	public void getMessage(String message) {

		System.out.println(message);

	}

}

// ����ͬ��

class China extends Country {

	public void getMessage(String message) {

		System.out.println(message);

	}

}

// ͬ��

class Country {

	public UnitedNations un;

	public void setUnitedNations(UnitedNations un) {

		this.un = un;

	};

	public void dedare(String message) {

		System.out.println(message);

	};

	public void getMessage(String message) {

		System.out.println(message);

	};

}

// �н�

class UnitedNations {

	public void dedare(String message, Country country) {

	}

}

// �����н�

class WTO extends UnitedNations {

	private China cn;

	private America us;

	public void setChina(China cn) {

		this.cn = cn;

		cn.getMessage("�й�");

		dedare("�й�", cn);
	}

	public void setAmerica(America us) {

		this.us = us;

		us.getMessage("����");

		dedare("����", us);

	}

	public void dedare(String message, Country country) {

		if (country == cn)

			System.out.println("�з�������飡" + message);

		else

			System.out.println("����������飡" + message);

	}

}
