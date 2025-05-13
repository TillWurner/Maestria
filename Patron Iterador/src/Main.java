import model.*;
import iterator.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Simulación de datos de Google
        GoogleUser[] googleUsers = {
            new GoogleUser("Ana Gomez", "ana@gmail.com"),
            new GoogleUser("Luis Pérez", "luis@google.com")
        };

        // Simulación de datos de Facebook
        List<FacebookUser> facebookUsers = List.of(
            new FacebookUser("Carlos Rivera", "fb.com/carlos"),
            new FacebookUser("María Torres", "fb.com/maria")
        );

        // Simulación de datos de CRE
        Map<Integer, UserData> creUsers = new HashMap<>();
        creUsers.put(1, new UserData("Pedro Soliz", "Av. Libertad #123", 150.75));
        creUsers.put(2, new UserData("Lucía Rojas", "Calle Bolívar #45", 200.00));

        // Lista de iteradores
        List<Iterator<SocialUser>> iteradores = List.of(
            new GoogleUserIterator(googleUsers),
            new FacebookUserIterator(facebookUsers),
            new CREUserIterator(creUsers)
        );

        // Mostrar todos los usuarios
        for (Iterator<SocialUser> it : iteradores) {
            while (it.hasNext()) {
                SocialUser user = it.next();
                System.out.println("Nombre: " + user.getName());
                System.out.println("Contacto: " + user.getContactInfo());
                System.out.println("---------------");
            }
        }
    }
}
