package com.gmail.alinakotova102.single.inheritance;

// Ассоциация - обьекты двух классов которые ссылаются друг на друга
// и она делится на 2 типа: агрегация(мягкая связь) и композиция(более тесная)
public class Composition{
    // Более тесная(тесная) связь, когда обьект при создании создается на основе другого через new в конструкторе

    class PC {
        GraphicsCard graphicsCard;

        // и при удалении обьекта ПК, вместе с ним и удаляется видеокарта,
        // так как они связаны и не могут существовать друг без друга
        public PC() {
            graphicsCard = new GraphicsCard();
        }
    }
}

class Aggregation {
    //Агрегация, это когда обьект является частью и может существовать и без этого обьекта
    // скажем так, обьект сам по себе, независим и его можно передать другому обьекту

    class PC {
        GraphicsCard graphicsCard;

        // обьект поступает "извне" и является его частью, но при этом ПК может продаваться и без видеокарты
        public PC (GraphicsCard graphicsCard) {
            this.graphicsCard = graphicsCard;
        }
    }
}

class GraphicsCard {}
