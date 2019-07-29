package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/577ff15ad648a14b780000e7">Welcome!</a>
 */
class Welcome
{
    static String greet(String language)
    {
        switch(language)
        {
            case "czech": return  "Vitejte";
            case "danish": return "Velkomst";
            case "dutch": return "Welkom";
            case "estonian": return "Tere tulemast";
            case "finnish":  return "Tervetuloa";
            case "flemish": return "Welgekomen";
            case "french": return "Bienvenue";
            case "german": return "Willkommen";
            case "irish": return "Failte";
            case "italian": return "Benvenuto";
            case "latvian": return "Gaidits";
            case "lithuanian": return  "Laukiamas";
            case "polish": return "Witamy";
            case "spanish": return  "Bienvenido";
            case "swedish": return "Valkommen";
            case "welsh": return "Croeso";
            default: return "Welcome";
        }
    }
}
