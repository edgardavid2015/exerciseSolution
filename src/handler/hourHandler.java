package handler;

public class hourHandler {
	public final static String[] WEEK = { "MO", "TU", "WE", "TH", "FR" };
	public final static String[] WEEKEND = { "SA", "SU" };

	public static String getStartHour(String timeRange) {
		String[] aux = timeRange.split("-");
		return aux[0];
	}

	public static String getFinishHour(String timeRange) {
		String[] aux = timeRange.split("-");
		return aux[1];
	}

	public static int convertToMinutes(String hours) {
		int minutes = 0;
		String[] aux = hours.split(":");
		minutes = Integer.parseInt(aux[0]) * 60 + Integer.parseInt(aux[1]);
		return minutes;
	}

	public static int getPriceWeekday(String startHour, String finishHour) {
		int priceAux = 0;
		String startAux, finishAux;
		if(finishHour.equals("00:00")) {
			finishHour = "24:00";
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("00:01")
				&& hourHandler.convertToMinutes(startHour) < hourHandler.convertToMinutes("09:01")) {
			if (hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("09:00")) {
				priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60)* 25;
			}
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("09:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("18:00")) {
				finishAux = "09:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 25
						+ ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(finishAux)) / 60)* 15;
			}
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("18:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("24:01")) {
				finishAux = "09:00";
				startAux = "18:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 25
						+ ((hourHandler.convertToMinutes(startAux) - hourHandler.convertToMinutes(finishAux)) / 60) * 15
						+ ((hourHandler.convertToMinutes(finishHour)- hourHandler.convertToMinutes(startAux))/ 60) * 20;
			}
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("09:01")
				&& hourHandler.convertToMinutes(startHour) < hourHandler.convertToMinutes("18:01")) {
			
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("09:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("18:01")) {
				priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60) * 15;
			}
			
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("18:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("24:01")) {
				finishAux = "18:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 15
						+ ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(finishAux)) / 60)* 20;
			}
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("18:01")) {
			priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60) * 20;
		}
		return priceAux;
	}

	public static int getPriceWeekend(String startHour, String finishHour) {
		int priceAux = 0;
		String startAux, finishAux;
		if(finishHour.equals("00:00")) {
			finishHour = "24:00";
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("00:01")
				&& hourHandler.convertToMinutes(startHour) < hourHandler.convertToMinutes("09:01")) {
			if (hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("09:00")) {
				priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60)* 30;
			}
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("09:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("18:00")) {
				finishAux = "09:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 30
						+ ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(finishAux)) / 60)* 20;
			}
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("18:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("24:01")) {
				finishAux = "09:00";
				startAux = "18:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 30
						+ ((hourHandler.convertToMinutes(startAux) - hourHandler.convertToMinutes(finishAux)) / 60) * 20
						+ ((hourHandler.convertToMinutes(finishHour)- hourHandler.convertToMinutes(startAux))/ 60) * 25;
			}
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("09:01")
				&& hourHandler.convertToMinutes(startHour) < hourHandler.convertToMinutes("18:01")) {
			
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("09:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("18:01")) {
				priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60) * 20;
			}
			
			if (hourHandler.convertToMinutes(finishHour) > hourHandler.convertToMinutes("18:00")
					&& hourHandler.convertToMinutes(finishHour) < hourHandler.convertToMinutes("24:01")) {
				finishAux = "18:00";
				priceAux = ((hourHandler.convertToMinutes(finishAux) - hourHandler.convertToMinutes(startHour)) / 60)* 20
						+ ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(finishAux)) / 60)* 25;
			}
		}
		if (hourHandler.convertToMinutes(startHour) > hourHandler.convertToMinutes("18:01")) {
			priceAux = ((hourHandler.convertToMinutes(finishHour) - hourHandler.convertToMinutes(startHour)) / 60) * 25;
		}
		return priceAux;
	}
}
