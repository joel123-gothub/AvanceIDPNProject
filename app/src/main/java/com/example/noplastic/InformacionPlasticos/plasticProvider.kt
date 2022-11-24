package com.example.noplastic.InformacionPlasticos

import com.example.noplastic.R

class plasticProvider {
    companion object{
        val listaPlastico= listOf<Plastico>(
            Plastico(
                "Tereftalato de polietileno","El plástico PET tiene un grado bajo de toxicidad. Este es el porqué de su aprobación para fabricar envases rígidos destinados al sector alimentario. El tereftalato de polietlieno es, además, un plástico irrompible, de alta resistencia química, indeformable y 100 % reciclable.",
                R.drawable.p1,
                R.drawable.plastic1
            ),
            Plastico(
                " Polietileno de alta densidad","El polietileno de alta densidad es fuerte y resistente a la humedad y los productos químicos, lo que lo hace ideal para cajas de cartón, contenedores, tuberías y otros materiales de construcción.",
                R.drawable.p2,
                R.drawable.plastic2
            ),
            Plastico(
                "Cloruro de polivinilo","Este plástico duro y rígido es resistente a los productos químicos y la intemperie, lo que lo hace deseable para aplicaciones de construcción; mientras que el hecho de que no conduce electricidad lo hace común para aplicaciones de alta tecnología, como alambres y cables.",
                R.drawable.p3,
                R.drawable.plastic3
            ),
            Plastico(
                "Polietileno de baja densidad","Una versión más suave, más clara y más flexible del HDPE. A menudo se usa como revestimiento dentro de envases de cartón para bebidas y en superficies de trabajo resistentes a la corrosión y otros productos.",
                R.drawable.p4,
                R.drawable.plastic4
            ),
            Plastico(
                "Polipropileno","Este plástico duradero es más resistente al calor que otros, lo que lo hace ideal para cosas como el envasado de alimentos y el almacenamiento de alimentos que está hecho para contener artículos calientes o calentarse por sí mismo",
                R.drawable.p5,
                R.drawable.plastic5
            ),
            Plastico(
                "Poliestireno","Más conocido como espuma de poliestireno, este plástico rígido es de bajo costo y aísla muy bien, lo que lo ha convertido en un elemento básico en las industrias de alimentos, embalaje y construcción.",
                R.drawable.p6,
                R.drawable.plastic6
            ),
            Plastico(
                "Otros","Es posible que ocasionalmente te encuentres con el código de reciclaje n.º 7, por lo que es importante saber qué significa. Lo más importante aquí es que estos plásticos no suelen ser reciclables.",
                R.drawable.p7,
                R.drawable.plastic7
            )

        )
    }
}