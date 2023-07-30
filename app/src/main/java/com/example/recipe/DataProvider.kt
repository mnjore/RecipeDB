package com.example.recipe

object DataProvider {
    val recipeList = listOf(
        Recipe(
            recipeId = 1,
            Name = "Tea",
            Type = "Breakfast or snack",
            Servings = 2,
            Difficulty = "Beginner",
            Ingredients = "1 cup milk\n" +
                    "1 cup water\n" +
                    "1 teaspoon tea powder\n" +
                    "Sugar or honey(optional)",
            Steps = "1. Mix 1 cup of water and the same amount of milk and heat the mixture" +
                    " in a microwavable device or on the stove until hot.\n" +
                    "2. Add in one teaspoon of the tea powder and stir. " +
                    "Be careful not to add more than that because the tea will become highly concentrated.\n" +
                    "3. Wait for few minutes until the tea becomes brown.\n" +
                    "4. Turn off the stove when the tea rises to the top.\n" +
                    "5. Filter the tea into a cup through a netted device (sieve).\n"+
                    "6. (Optional) Sweeten with honey or sugar and enjoy!.\n",
            ImageId = R.drawable.tea
        ),
        Recipe(
            recipeId = 2,
            Name = "Pancakes",
            Type = "Breakfast",
            Servings = 3,
            Difficulty = "Intermediate",
            Ingredients = "2 cups flour\n" +
                    "3 eggs\n" +
                    "1 1/2 cups milk\n" +
                    "2 tablespoons butter\n" +
                    "5 tablespoons sugar\n" +
                    "Butter or syrup (optional)",
            Steps = "1. Crack the eggs into a bowl and beat until creamy. Add in the dry " +
                    "ingredients. Do not stir yet!\n" +
                    "2. Melt the butter completely (about a minute in a microwave is sufficient).\n" +
                    "3. Add the butter and milk to the mix. Stir gently, leaving some small clumps " +
                    "in the batter.\n" +
                    "4. Heat the frying pan to a medium-low flame.\n" +
                    "5. Slowly pour about 3 tablespoons to 1/4 cup batter onto the frying pan. The " +
                    "amount you pour will decide the final size of your pancakes.\n" +
                    "6. Cook for about two minutes or until the pancake is golden. You should then " +
                    "flip the pancake gently.\n" +
                    "7. Cook the other side until golden and remove.\n" +
                    "8. (Optional) Add butter or syrup to your pancakes for more flavor. Enjoy!",
            ImageId = R.drawable.pancake
        ),
        Recipe(
            recipeId = 3,
            Name = "Omelette",
            Type = "Breakfast",
            Servings = 1,
            Difficulty = "Intermediate",
            Ingredients = "2 eggs\n" +
                    "2 tablespoons butter or cooking oil\n" +
                    "1/2 tomato\n" +
                    "1/2 onion\n" +
                    "1 sausage",
            Steps = "1. Prepare the ingredients. Select and cut up all of your ingredients into " +
                    "bite-sized pieces.\n" +
                    "2. Crack the eggs and beat until completely mixed.\n" +
                    "3. Add salt, pepper, flour (optional) and the ingredients to the eggs mixture.\n" +
                    "4. Flip the omelette once the eggs bubble on top. Keep cooking for another " +
                    "minute or two, until the omelette is no longer runny.\n" +
                    "5. Serve and enjoy!",
            ImageId = R.drawable.omelette
        ),
        Recipe(
            recipeId = 4,
            Name = "Smocha/Smokie chapo",
            Type = "Breakfast, lunch, supper or snack",
            Servings = 1,
            Difficulty = "Beginner",
            Ingredients = "1 chapati\n" +
                    "1 smokie\n" +
                    "2 tablespoon kachumbari\n" +
                    "1/8 avocado (optional)\n" +
                    "Tomato sauce\n" +
                    "Bbq sauce\n" +
                    "Mayonnaise (optional)",
            Steps = "1. Cut the smokie vertically but not fully in half.\n" +
                    "2. Place the smokie on the chapati and add the kachumbari to the middle.\n" +
                    "3. (Optional) Add the avocado, tomato sauce, bbq sauce and/or mayonnaise.\n" +
                    "4. Cut in half and enjoy!",
            ImageId = R.drawable.smocha
        ),
        Recipe(
            recipeId = 5,
            Name = "Fries",
            Type = "Lunch or supper",
            Servings = 4,
            Difficulty = "Intermediate",
            Ingredients = "10 large potatoes\n" +
                    "1L of frying oil\n" +
                    "A few pinches of salt\n" +
                    "Ketchup (optional)",
            Steps = "1. Peel and rinse the potatoes. Then cut them into sticks.\n" +
                    "2. Rinse them again with cold water. Then let them completely dry.\n" +
                    "3. Pour the oil into a heavy pot and turn the burner to medium-high and heat " +
                    "the oil\n" +
                    "4. Lower 1/3 of the fries into the oil and fry them for 6 to 9 minutes.\n" +
                    "5. Transfer the fries to paper towels, sprinkle on salt and repeat for the " +
                    "remaining 2 batches.\n" +
                    "6. (Optional) Serve with ketchup. Enjoy!",
            ImageId = R.drawable.fries
        ),
        Recipe(
            recipeId = 6,
            Name = "White Rice",
            Type = "Lunch or supper",
            Servings = 1,
            Difficulty = "Beginner",
            Ingredients = "1 cup white rice\n" +
                    "1 to 1 1⁄4 cups water\n" +
                    "1/2 teaspoon of salt\n" +
                    "1 tablespoon of unsalted butter (optional)",
            Steps = "1. Pour the rice into a fine, mesh strainer, then hold the strainer under cool," +
                    " running water until the water runs clear to rinse it.\n" +
                    "2. Combine the water and rinsed rice in a pot. Pour the water into the pot " +
                    "first, then add the rice.\n" +
                    "3. Add some salt and butter (optional), and bring the rice to a boil over high" +
                    " heat.\n" +
                    "4. Once boiling, reduce the heat to low or medium-low. Wait for the water to " +
                    "reduce to a simmer, then wait for 18 to 20 minutes. If it's not done, cook it " +
                    "for another 1 to 2 minutes. The rice is ready when the water disappears.\n" +
                    "5. Take the rice off the burner and let it sit, covered, for 15 to 20 minutes.\n" +
                    "6. Fluff the rice with a fork, serve and enjoy!\n",
            ImageId = R.drawable.rice
        ),
        Recipe(
            recipeId = 7,
            Name = "Milkshake",
            Type = "Snack",
            Servings = 2,
            Difficulty = "Beginner",
            Ingredients = "6 scoops of ice cream\n" +
                    "1/2 cup milk\n" +
                    "Any flavour syrup (optional)\n" +
                    "Vanilla extract (optional)\n" +
                    "Malt powder (optional)\n" +
                    "Frozen fruit (optional)",
            Steps = "1. Let your ice cream soften to the consistency of soft-serve. A few minutes " +
                    "will do.\n" +
                    "2. Add the ice cream to your blender or milkshake mixer.\n" +
                    "3. Pour in the milk, vanilla extract(optional), and any additional ingredients.\n" +
                    "4. Blend your milkshake for between 30 seconds and 1 minute.\n" +
                    "5. Pour the milkshake into your chilled glass and enjoy!",
            ImageId = R.drawable.milkshake
        ),
        Recipe(
            recipeId = 8,
            Name = "Carbonara florentine",
            Type = "Lunch or supper",
            Servings = 4,
            Difficulty = "Advanced",
            Ingredients = "1 tbsp white vinegar\n" +
                    "6 Free Range Eggs\n" +
                    "500g fresh fettuccine or pappardelle\n" +
                    "6 pancetta slices\n" +
                    "2 Free Range Egg yolks\n" +
                    "1/2 cup (125ml) thickened cream\n" +
                    "1/2 cup (40g) finely grated parmesan\n" +
                    "120g pkt Coles Australian Baby Spinach",
            Steps = "1. Bring a saucepan of water to a simmer over high heat then add the vinegar.\n" +
                    "2. Crack 1 egg into a small bowl. Stir the water to create a whirlpool and pour" +
                    " the egg into the centre of the whirlpool.\n" +
                    "3. Cook, without stirring, for 3 mins for a runny yolk or until cooked to your" +
                    " liking.\n" +
                    "4. Use a slotted spoon to transfer to a bowl and cover to keep warm.\n" +
                    "5. Repeat, in batches, with 3 more eggs.\n" +
                    "6. Cook the pasta in a large saucepan of boiling water following packet directions" +
                    " or until al dente and then drain well.\n" +
                    "7. Heat a large frying pan over medium heat then add pancetta.\n" +
                    "8. Cook for 2 mins each side or until the pancetta is crisp.\n" +
                    "9. Cool slightly then transfer to a clean work surface and coarsely chop.\n" +
                    "10. Whisk egg yolks, cream, parmesan and remaining eggs in a bowl. Season.\n" +
                    "11. Return the pasta to the pan with the pancetta and spinach. Place over low heat.\n" +
                    "12. Pour over the egg mixture into the pan.\n" +
                    "13. Cook, tossing, for 1-2 mins or until the spinach wilts and the sauce thickens" +
                    " slightly.\n" +
                    "14. Divide pasta among serving bowls and top with the poached eggs. Season and enjoy!\n",
            ImageId = R.drawable.carbonara_florentine
        ),
        Recipe(
            recipeId = 9,
            Name = "Lemony ginger-spiced biscuits",
            Type = "Snack",
            Servings = 5,
            Difficulty = "Advanced",
            Ingredients = "2 tbsp ground ginger\n" +
                    "2 1/4 cups (335g) plain flour\n" +
                    "1/4 cup (45g) rice flour\n" +
                    "1/2 cup (80g) pure icing sugar\n" +
                    "250g butter, chopped\n" +
                    "1 tsp vanilla bean paste\n" +
                    "1 Free Range Egg yolk\n" +
                    "Lemon zest, to serve\n" +
                    "2 1/2 cups (400g) pure icing sugar, sifted\n" +
                    "2 1/2 tbsp lemon juice",
            Steps = "1. Place the ginger, flour, rice flour and icing sugar in a food processor" +
                    " and process until combined.\n" +
                    "2. Add the butter and vanilla and pulse until the mixture resembles fine " +
                    "breadcrumbs.\n" +
                    "3. Add the egg yolk and process until mixture just comes together.\n" +
                    "4. Turn the dough onto a lightly floured surface. Gently knead until smooth.\n" +
                    "5. Divide dough into 2 even portions. Cover each portion in plastic wrap and" +
                    " place in fridge for 30 mins to chill.\n" +
                    "6. Preheat oven to 180°C and line 2 large baking trays with baking paper.\n" +
                    "7. Roll out 1 dough portion between 2 sheets of baking paper to a 3mm-thick disc.\n" +
                    "8. Use a 6cm round fluted pastry cutter to cut discs from the dough, " +
                    "(re rolling the excess) and place on 1 lined tray.\n" +
                    "9. Repeat with the remaining dough portion and place in the fridge for 10 mins" +
                    " to chill.\n" +
                    "10. Bake, swapping the trays halfway through cooking, for 12-15 mins or " +
                    "until the biscuits are light golden then set aside on the trays to cool " +
                    "completely.\n" +
                    "11. Combine the icing sugar and lemon juice in a medium bowl and place the" +
                    " mixture in a sealable plastic bag.\n" +
                    "12. Cut off 1 small corner and pipe over each biscuit.\n" +
                    "13. Sprinkle with the lemon zest to serve.",
            ImageId = R.drawable.ginger_biscuits
        ),
        Recipe(
            recipeId = 10,
            Name = "Lime and raspberry vegan cheesecake",
            Type = "Snack",
            Servings = 16,
            Difficulty = "Advanced",
            Ingredients = "700g cashews\n" +
                    "1/2 cup (80g) almond kernels\n" +
                    "1/2 cup (40g) shredded coconut\n" +
                    "8 fresh dates, pitted, chopped\n" +
                    "1 tbsp coconut oil, melted\n" +
                    "Pinch of salt\n" +
                    "2 limes, rind finely grated, juiced\n" +
                    "2 x 270ml cans coconut cream\n" +
                    "1/2 cup (125ml) maple syrup\n" +
                    "250g fresh or frozen raspberries",
            Steps = "1. Divide the cashews evenly among 2 heatproof bowls, pour over enough boiling" +
                    " water to cover and set aside for 4 hours to soak.\n" +
                    "2. Grease a 20cm (base measurement) spring form pan and line the base and side" +
                    " with baking paper.\n" +
                    "3. Place the almonds and coconut in a food processor and process until finely" +
                    " chopped.\n" +
                    "4. Add the date, coconut oil and salt then process until mixture holds together" +
                    " when pinched.\n" +
                    "5. Spoon the almond mixture over base of prepared pan and use the back of " +
                    "the spoon to spread and press evenly over the base.\n" +
                    "6. Place in the freezer for 30 mins to set.\n" +
                    "7. Drain 1 bowl of cashews, the lime rind, lime juice, half the coconut cream" +
                    " and half the maple syrup in a blender and dlend until very smooth and creamy.\n" +
                    "8. Pour over the almond mixture in the pan, smooth the surface and place in " +
                    "the freezer for 30 mins or until firm.\n" +
                    "9. Drain remaining bowl of cashews, the raspberries, remaining coconut cream " +
                    "and remaining maple syrup in a blender and blend until very smooth and creamy.\n" +
                    "10. Pour over lime layer in pan, smooth the surface and place in freezer for " +
                    "4 hours or until firm. Store in freezer until ready to eat.\n" +
                    "11. Before serving, remove cheesecake from freezer and set aside for 30 mins " +
                    "to soften slightly.\n" +
                    "12. Transfer to a serving platter and cut into wedges to serve.",
            ImageId = R.drawable.lime_raspberry_vegan_cheesecake
        ),
    )
}