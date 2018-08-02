package designPatterns.builderPattern;

/**
 * Created by liufengfang on 2018/7/11.
 */
public class NutritionFacts {
    //必选参数
    private final int servingSize;
    private final int servings;
    //可选参数
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {//构造器
        //必选参数
        private final int servingSize;
        private final int servings;
        //可选参数
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int serings) {
            this.servingSize = servingSize;
            this.servings = serings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts builder() {
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        //分别设置每一个参数，
        NutritionFacts nutritionFacts=new NutritionFacts.Builder(15, 20).
                calories(1).carbohydrate(2).fat(3).sodium(4).builder();
    }
}
