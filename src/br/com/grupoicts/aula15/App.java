package br.com.grupoicts.aula15;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		// ==============================================
		// AULA 15 udemy 100. Manilulando Date & Calendar
		// ==============================================
        //Adding 4 Hours  >> press <CTL><SHIFT><O> Import Java Classes
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        //Adding 4 Hours  >> press <CTL><SHIFT><O> Import Java Classes
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4); //Adding 4 Hours on date
        d = cal.getTime();
        System.out.println(sdf.format(d));
        //Getting Specific value of Calendar 
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;//Month 0 - 11
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.printf("%02d/%02d/%04d %02d:%02d:%02d Config: Dia Da Semana[%d]\n",day_of_month,month,year,hour,minute,second,day_of_week);
        d = new Date(); //Getting current date time
        cal.setTime(d);
        System.out.println(sdf.format(d));
        //Getting Specific value of Calendar 
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH)+1;//Month 0 - 11
        day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        hour = cal.get(Calendar.HOUR);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
        System.out.printf("%02d/%02d/%04d %02d:%02d:%02d   Hoje: Dia Da Semana[%d]\n",day_of_month,month,year,hour,minute,second,day_of_week);
        
        // ===============================
		// AULA 15 udemy 101. Git & GitHub
		// ===============================
        // ler pdf na pasta docs\06.bonus-git-github.pdf
        // *** PESSOAL EH SUPER IMPORTANTE ASSISTIREM DE .101 a .109
        // *** ALI IRAS APRENDER MACETES DO USO DO GITHUB e GIT ****
        
	}

}
