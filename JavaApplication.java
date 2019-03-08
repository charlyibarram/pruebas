/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.stram;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author cibarra
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Persona> personas= new ArrayList<Persona>();
        
        personas.add(new Persona("Carlos", LocalDate.of(1976, Month.MARCH, 2), "ZAC", 87545));
        personas.add(new Persona("Juan", LocalDate.of(1976, Month.MARCH, 2), "MTY", 82245));
        personas.add(new Persona("Maria", LocalDate.of(1945, Month.DECEMBER, 6), "OAX", 8545));
        personas.add(new Persona("Pedro", LocalDate.of(1987, Month.APRIL, 8), "CDMX", 9145));
        personas.add(new Persona("Joel", LocalDate.of(1990, Month.NOVEMBER, 9), "CDMX", 41545));
        personas.add(new Persona("Marino", LocalDate.of(1992, Month.MAY, 11), "SLP", 7745));
        personas.add(new Persona("Antonio", LocalDate.of(2000, Month.OCTOBER, 21), "CDMX", 7545));
        
        
        List<String> strings= new ArrayList<String>();
        
        
       // personas.stream().filter(p->p.getFechaNac().isLeapYear()).forEach(p->System.out.println(p));
       //personas.stream().filter(p->p.getNombre().startsWith("A")).filter(p->p.getCiudadOrigen().equals("CHI")).forEach(p->System.out.println(p));
         
       //personas.stream().peek(p->p.setFechaNac(p.getFechaNac().plusYears(2))).filter(p->p.getFechaNac().getYear()>1990).forEach(p->System.out.println(p));
       
     //  DateTimeFormatter formato=DateTimeFormatter.ofPattern("EEEE, dd, 'de' MMMM, 'de' yyyy");
       
       
      // personas.stream().map(p->p.getFechaNac().format(formato)).forEach(p->strings.add(p));
         
        
      //  strings.stream().forEach(s->System.out.println(s));
      
      
     // personas.stream().sorted().forEach(p->System.out.println(p));
      
    //  Comparator<Persona> comparador=(a,b)->a.getFechaNac().compareTo(b.getFechaNac());
      
     // personas.stream().sorted(comparador.thenComparing(p->p.getNombre())).forEach(p->System.out.println(p));
     
  //   long l= personas.stream().filter(p->p.getFechaNac().getYear()>1990).count();
     
  //      System.out.println("Long=="+l);
  
 // double sueldos=personas.stream().mapToDouble(p->p.getSueldo()).sum();
   //    System.out.println("sueldos=="+sueldos);
   
   //OptionalDouble op=personas.stream().mapToDouble(p->p.getSueldo()).average();
  // System.out.println(op.isPresent()?op.getAsDouble():0.0);
   
   
 //  double d2=personas.stream().mapToDouble(p->p.getSueldo()).average().orElse(0);
   
 //  double d3=personas.stream().mapToDouble(p->p.getSueldo()).average().orElseThrow(()->new RuntimeException ("no hay"));
   
  
// List<Persona> listaCDMX= personas.stream().filter(p->p.getCiudadOrigen().equals("CDMX")).collect(Collectors.toList()); 

//Map<String, LocalDate> mapa=personas.stream().collect(Collectors.toMap(p->p.getNombre(), p->p.getFechaNac()));

//mapa.forEach((a,b)->System.out.println("La llave es: "+a+" valor:"+b));

//Map<String, List<Persona>> mapa=personas.stream().collect(Collectors.groupingBy(p->p.getCiudadOrigen()));


//mapa.forEach((a,b)->System.out.println("La llave es: "+a+" valor:"+b));


//Map<Boolean, List<Persona>> mapa=personas.stream().collect(Collectors.partitioningBy(p->p.getSueldo()>30_000));


//mapa.forEach((a,b)->System.out.println("La llave es: "+a+" valor:"+b));

//Persona per= personas.stream().filter(p->p.getFechaNac().getYear()>1990).findAny().orElseThrow(()->new RuntimeException ("ocurrio una excepcion"));

//Persona per2= personas.stream().filter(p->p.getFechaNac().getYear()>1990).findFirst().orElseThrow(()->new RuntimeException ("ocurrio una excepcion"));

//System.out.println("PERSONA="+per2);


//boolean pers=personas.stream().anyMatch(p->p.getNombre().startsWith("A"));

//boolean rr=personas.stream().noneMatch(p->p.getNombre().startsWith("A"));

//System.out.println("PERSONA="+rr);

double rangeMin = 1000;
double rangeMax = 2001;
Random r = new Random();
double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        System.out.println("randomValue"+randomValue);
        
        Calendar unaFecha;
            int numero = 0;
        Random aleatorio;
        aleatorio = new Random();

        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(10)+2014, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        System.out.println("La fecha vale " + sdf.format(unaFecha.getTime()));
        
    }//
    
 
    
    
}
