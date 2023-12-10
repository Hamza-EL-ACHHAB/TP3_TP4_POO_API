# TP 3 && TP4

Réalisation d’une application web avec Spring Boot
&& Utilisation d'API web avec Spring Boot

#Lien vers github : https://github.com/Hamza-EL-ACHHAB/TP3_TP4_POO_API.git

## definitions des Dependences

DevTools : Spring Boot DevTools est un module du framework Spring Boot qui fournit des fonctionnalités amicales pour le développeur pour un développement rapide et un débogage. Il inclut des fonctionnalités telles que le redémarrage automatique de l'application, le rechargement en direct des ressources et la possibilité d'exécuter l'application dans un environnement de développement.

Thymeleaf : Thymeleaf est un moteur de template Java pour les applications web. Il est utilisé pour générer des pages HTML dynamiques sur la base de templates et de données. Thymeleaf est souvent utilisé pour générer des vues dans les applications web basées sur Spring.

Spring Web : Spring Web est un module du framework Spring qui fournit une prise en charge pour la construction d'applications web. Il inclut des fonctionnalités telles qu'un contexte d'application web, des options de configuration spécifiques au web et une prise en charge des technologies web courantes telles que HTTP et Servlets.

Hibernate : Hibernate est un framework ORM open-source qui met en œuvre la spécification JPA. Il fournit un moyen de mapper des objets Java sur des tables de base de données relationnelles et fournit un langage de requête pour interagir avec les données. Hibernate est un choix populaire pour ORM dans les applications Java.

H2 : H2 est un système de gestion de bases de données relationnelles open-source écrit en Java. Il est léger et peut être intégré dans des applications Java ou exécuté en tant que serveur autonome. H2 est couramment utilisé dans les environnements de développement et de test en raison de sa petite empreinte et de sa facilité d'utilisation.

JPA : JPA signifie Java Persistence API. C'est une spécification Java pour accéder, persister et gérer les données entre les objets/classes Java et une base de données relationnelle. JPA est un standard pour la mappage objet-relationnel (ORM) et fournit un moyen de mapper des objets Java sur des tables de base de données relationnelles.





## TP3 : reponses aux questions

 ### Etape 13 :


1. Avec l'annotation @GetMapping("/greeting") nous avons paramétré l'url d'appel /greeting pour la méthode greeting().

2. Avec la méthode "return "greeting";" nous avons choisi le fichier HTML à afficher.

3. en utilisant le paramètre @RequestParam de la méthode greeting(). Le paramètre "nameGET" est utilisé pour récupérer la valeur passée dans l'url sous forme de query parameter "name". Ensuite, cette valeur est ajoutée au modèle avec "model.addAttribute("nomTemplate", nameGET);" puis est passée à la vue pour être affichée.


 ### Etape 17 : 

on trouve qu'une nouvelle table ADDRESS dérivée de la class Address est crée automatiquement

### Etape 18 :

Hibernate est un outil ORM qui nous permet d'interagir avec une base de données en utilisant des objets Java. Voici le processus général de ce qui s'est passé :
La classe Adress avait l'annotation @Entity qui sera utilisée pour générer des tables avec. Cela indique à Hibernate que la classe doit être utilisée pour générer une table.
Les champs sont annotés par : @Id pour la clé primaire, @Column pour les colonnes, et @ManyToOne pour les relations.
 l'application et les tables seront créées automatiquement par Hibernate lors du démarrage.

### Etape 19 :

oui, ça marche.

### Etape 22 :

L'annotation @Autowired est utilisée pour injecter des dépendances dans les classes de l' application. Il permet de demander à Spring de fournir une instance d'une classe dépendante (ou d'une interface) pour une classe qui en a besoin.
Spring va automatiquement créer une instance de l'objet nécessaire et l'injecter dans la variable donnee. Cela permet de supprimer la nécessité de créer manuellement les instances des objets nécessaires et de les assigner aux variables, ce qui facilite la gestion des dépendances et améliore la lisibilité du code.



### Etape 30

en ajoutant les CDN et les scripts associés à bootstrap ci-dessous à la partie head de la page HTML.


## TP4: Etape 6 

1. oui, il est nécessaire d'avoir une clé API valide pour utiliser l'API de MeteoConcept, j'ai utilisé la clé : "f1ceb7a84775574fa2cc64a6ccb0e99ea3ddd86f06abafa315f58cd7d6873b6f"


2. L'URL suivant : https://api.meteo-concept.com/api/forecast/daily
 

3. on utilise la methode GET


4. il faut les inclure dans l'URL de la maniere suivante:  "https://api.meteo-concept.com/api/forecast/daily?token="+METEO_API_TOKEN+"&latlng="+latitude+","+longitude+"&world=false&start=0&end=1"


5.1.   Pour afficher la température du lieu visé par les coordonnées GPS :
	response.getBody().getForecast(lat,lon).getForecast().get(0).getTmin()

5.2.  Pour afficher la prévision de météo du lieu visé par les coordonnées GPS :
  	response.getBody().getForecast(lat,lon).getCity().getName()


