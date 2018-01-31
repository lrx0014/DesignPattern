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

// 具体同事

class America extends Country {

	public void getMessage(String message) {

		System.out.println(message);

	}

}

// 具体同事

class China extends Country {

	public void getMessage(String message) {

		System.out.println(message);

	}

}

// 同事

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

// 中介

class UnitedNations {

	public void dedare(String message, Country country) {

	}

}

// 具体中介

class WTO extends UnitedNations {

	private China cn;

	private America us;

	public void setChina(China cn) {

		this.cn = cn;

		cn.getMessage("中国");

		dedare("中国", cn);
	}

	public void setAmerica(America us) {

		this.us = us;

		us.getMessage("美国");

		dedare("美国", us);

	}

	public void dedare(String message, Country country) {

		if (country == cn)

			System.out.println("中方提出抗议！" + message);

		else

			System.out.println("美方提出抗议！" + message);

	}

}
