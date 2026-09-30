package r5a08.tp1;

public class UserGreeting {
    public String formatGreeting(String nom){
        if (nom == null || nom.trim().isEmpty()) {
            throw new UserGreetingFailureException("ne doit pas être vide");
        }
        
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("ne doit pas dépasser 10 caractères");
        }
        
        if (!nom.matches("^[a-zA-Z0-9]+$")) {
            throw new UserGreetingFailureException("ne doit pas contenir de caractères spéciaux, ni d'espaces");
        }

        return "Bonjour, " + nom;
    }
}
