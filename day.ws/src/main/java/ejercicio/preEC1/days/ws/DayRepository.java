package ejercicio.preEC1.days.ws;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Day;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DayRepository {
    private static final Map<String, Day> days = new HashMap<>();
    @PostConstruct
	public void initData() {
		Day lunes = new Day();
		lunes.setName("Lunes");
        lunes.setTraduction("Monday");
        lunes.setNumero("uno");
        lunes.setNtraduc("one");
        
		days.put(lunes.getName(), lunes);

		Day martes = new Day();
		martes.setName("Martes");
        martes.setTraduction("Tuesday");
        martes.setNumero("dos");
        martes.setNtraduc("two");
        
		days.put(martes.getName(), martes);

        Day miercoles = new Day();
		miercoles.setName("Miercoles");
        miercoles.setTraduction("Wednesday");
        miercoles.setNumero("tres");
        miercoles.setNtraduc("three");
        
		days.put(miercoles.getName(), miercoles);

        Day jueves = new Day();
		jueves.setName("Jueves");
        jueves.setTraduction("Thursday");
        jueves.setNumero("cuatro");
        jueves.setNtraduc("four");
        
		days.put(jueves.getName(), jueves);

        Day viernes = new Day();
		viernes.setName("Viernes");
        viernes.setTraduction("Friday");
        viernes.setNumero("cinco");
        viernes.setNtraduc("five");
        
		days.put(viernes.getName(), viernes);

	}


    public Day findDays(String name) {
		Assert.notNull(name, "The day's name must not be null");
		return days.get(name);
	}
}
