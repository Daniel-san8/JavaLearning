import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        Instant instant = Instant.now();
        LocalDate parseLocal = LocalDate.parse("2020-01-01");
        LocalDateTime parseLocalDateTime = LocalDateTime.parse("2020-01-01T00:00:00");
        Instant parseInstant = Instant.parse("2020-01-01T00:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date01);
        System.out.println(date02);
        System.out.println(instant);

    }
}