package com.mehdisekoba.motionlayout.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.mehdisekoba.motionlayout.R
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ImageData(
    val id: @RawValue Int,
    @DrawableRes val remoteImageUrl: Int,
    @DrawableRes val remoteImage: Int,
    val name: @RawValue String,
    val description: @RawValue String,
    val location: @RawValue String,
) : Parcelable

@Suppress("ktlint:standard:max-line-length")
val imageUrlList =
    listOf(
        ImageData(
            id = 1,
            remoteImageUrl = R.drawable.eiffel,
            remoteImage = R.drawable.eiffel_paris,
            name = "Eiffel Tower",
            description =
                "The Eiffel Tower, one of the most iconic landmarks in the world, stands tall and proud amidst the bustling cityscape of Paris, France. This architectural masterpiece, named after its designer Gustave Eiffel, has become synonymous with the city of love, drawing millions of visitors from around the globe each year to marvel at its beauty and grandeur.\n" +
                    "\n" +
                    "Rising to a height of 324 meters (1,063 feet), the Eiffel Tower held the title of the world's tallest man-made structure for over 40 years after its completion in 1889. While it has since been surpassed in height by many other structures, its significance and allure remain unparalleled.\n" +
                    "\n" +
                    "Constructed from over 18,000 individual iron parts, the Eiffel Tower is a marvel of engineering and innovation. Its intricate lattice design not only lends it strength and stability but also contributes to its aesthetic appeal. The tower's iron framework, painted in a distinctive shade of reddish-brown known as \"Eiffel Tower Brown,\" gives it a timeless and elegant appearance, especially when illuminated against the Parisian skyline at night.\n" +
                    "\n" +
                    "The Eiffel Tower is divided into three levels, each offering its own unique perspective and attractions. The first level, accessible by stairs or elevator, features exhibits and displays recounting the history and construction of the tower. Visitors can also enjoy panoramic views of Paris and its landmarks from observation platforms situated around the perimeter.\n" +
                    "\n" +
                    "Ascending to the second level, visitors are treated to even more breathtaking vistas and a variety of dining options, including the renowned Le 58 Tour Eiffel restaurant. This level also houses gift shops where visitors can purchase souvenirs to commemorate their visit.\n" +
                    "\n" +
                    "For the adventurous souls, the journey doesn't end there. The third level, accessible by elevator, offers the highest vantage point open to the public. From this lofty perch, visitors can enjoy unparalleled views stretching across the city and beyond, with landmarks such as the Arc de Triomphe, Notre-Dame Cathedral, and the Sacré-Cœur Basilica visible on clear days.\n" +
                    "\n" +
                    "Beyond its architectural significance and tourist appeal, the Eiffel Tower holds a special place in the hearts of Parisians and the French people as a symbol of national pride and cultural heritage. Originally intended as a temporary exhibit for the 1889 Exposition Universelle (World's Fair), the tower quickly captured the imagination of the public and cemented its place as a permanent fixture on the Parisian skyline.\n" +
                    "\n" +
                    "Over the years, the Eiffel Tower has witnessed countless historic events and cultural milestones, serving as a backdrop for everything from romantic proposals to political rallies. It has been featured in numerous works of art, literature, and cinema, further solidifying its status as a global icon.\n" +
                    "\n" +
                    "Today, the Eiffel Tower continues to inspire awe and wonder, standing as a testament to human ingenuity and creativity. Whether admired from afar or experienced up close, it remains a beacon of beauty and elegance, drawing visitors from all corners of the world to marvel at its timeless allure.",
            location = "Paris, France",
        ),
        ImageData(
            id = 2,
            remoteImageUrl = R.drawable.maldives,
            remoteImage = R.drawable.maldives_mal,
            name = "Maldives",
            description =
                "The Maldives, an archipelago nation in the Indian Ocean, is renowned for its stunning natural beauty, turquoise waters, and vibrant marine life. Comprising 26 atolls and over 1,000 coral islands, it is one of the world's most sought-after tourist destinations, attracting travelers with its luxurious resorts, pristine beaches, and diverse underwater ecosystems.\n" +
                    "\n" +
                    "Geographically, the Maldives is located southwest of Sri Lanka and India, spanning approximately 298 square kilometers of land area dispersed over 90,000 square kilometers of the ocean. The islands are grouped into 26 natural atolls, each surrounded by its own unique coral reef system. These atolls are formed from the tops of a vast undersea mountain range, making the Maldives a true oceanic paradise.\n" +
                    "\n" +
                    "The Maldives boasts a tropical climate characterized by two distinct seasons: the dry northeast monsoon (Iruvai) from December to March and the wet southwest monsoon (Hulhangu) from May to November. Temperatures remain consistently warm throughout the year, typically ranging from 25°C to 31°C, making it an ideal destination for sun-seekers and beach lovers alike.\n" +
                    "\n" +
                    "One of the most captivating features of the Maldives is its breathtaking underwater scenery. The crystal-clear waters provide excellent visibility for snorkeling and diving enthusiasts, allowing them to explore vibrant coral gardens teeming with an array of marine life, including colorful reef fish, sea turtles, manta rays, and even whale sharks. Numerous dive sites around the islands offer diverse experiences, from shallow coral gardens suitable for beginners to exhilarating drift dives and encounters with larger pelagic species.\n" +
                    "\n" +
                    "In addition to its natural wonders, the Maldives boasts a rich cultural heritage shaped by its history of trade, exploration, and Islamic influence. The earliest settlers are believed to have arrived around 2,500 years ago, and the islands have since been influenced by various cultures, including Indian, Arab, and European. This multicultural heritage is reflected in the Maldivian language (Dhivehi), cuisine, and traditional arts and crafts.\n" +
                    "\n" +
                    "Islam plays a central role in Maldivian society, with the majority of the population adhering to Sunni Islam. Visitors to the islands will often encounter mosques with intricate architecture and hear the call to prayer echoing across the tranquil landscapes.\n" +
                    "\n" +
                    "Despite its remote location, the Maldives has developed into a world-class tourist destination, with an emphasis on sustainable tourism and eco-friendly practices. Many resorts and hotels are committed to minimizing their environmental impact through initiatives such as reef conservation, renewable energy, and waste management programs.\n" +
                    "\n" +
                    "The capital city of Malé serves as the political, economic, and cultural hub of the Maldives. Situated on the island of the same name, Malé is a bustling metropolis characterized by colorful buildings, lively markets, and narrow streets bustling with activity. Visitors can explore historical landmarks such as the Old Friday Mosque (Hukuru Miskiy) and the Sultan Park, as well as indulge in shopping for local handicrafts and souvenirs.\n" +
                    "\n" +
                    "Beyond Malé, each island in the Maldives offers its own unique charm and experiences. From secluded private resorts catering to luxury travelers to budget-friendly guesthouses providing an authentic Maldivian experience, there is something for every type of traveler. Whether relaxing on the sun-kissed beaches, exploring the underwater world, or immersing oneself in the local culture, the Maldives offers a truly unforgettable escape into paradise.",
            location = "Malé",
        ),
        ImageData(
            id = 3,
            remoteImageUrl = R.drawable.taj_mahal,
            remoteImage = R.drawable.taj_mahal_india,
            name = "Taj Mahal",
            description =
                "The Taj Mahal stands as an epitome of love and architectural grandeur, nestled on the banks of the Yamuna River in Agra, India. Its pristine white marble facade, intricate craftsmanship, and poignant history have rendered it one of the most iconic and recognizable landmarks globally. Let us embark on a journey to unravel the magnificence and allure of this architectural marvel.\n" +
                    "\n" +
                    "Commissioned by the Mughal emperor Shah Jahan in memory of his beloved wife Mumtaz Mahal, the Taj Mahal is a mausoleum that symbolizes eternal love and devotion. Its construction commenced in 1632 and took approximately 20,000 artisans over two decades to complete, culminating in 1653. The name \"Taj Mahal\" translates to \"Crown of Palaces\" in Persian, reflecting its regal stature and opulence.\n" +
                    "\n" +
                    "Approaching the Taj Mahal through the imposing gate reveals a breathtaking vista, with the pristine marble structure framed by lush gardens, reflecting pools, and symmetrical minarets. The main mausoleum stands on a raised platform, emphasizing its significance and dominance over the landscape. The meticulously laid out gardens, inspired by Persian Charbagh design, symbolize paradise on Earth, with fountains and pathways adding to the ethereal ambiance.\n" +
                    "\n" +
                    "The central structure of the Taj Mahal is a masterpiece of Mughal architecture, characterized by its seamless fusion of diverse influences, including Persian, Islamic, and Indian styles. The mausoleum's symmetrical layout is a testament to the meticulous planning and precision of Mughal architects and craftsmen. Four towering minarets flank the main structure, serving both aesthetic and structural purposes, while also accentuating its verticality and grace.\n" +
                    "\n" +
                    "The Taj Mahal's most striking feature is its pristine white marble facade, which seems to shimmer and change hues with the shifting light of the day. The marble panels are adorned with intricate inlay work, known as pietra dura, comprising semi-precious stones such as jasper, jade, turquoise, and lapis lazuli. These delicate floral motifs, arabesques, and calligraphy inscriptions add depth, texture, and symbolism to the monument, reflecting themes of paradise, eternity, and divine love.\n" +
                    "\n" +
                    "At the heart of the Taj Mahal lies the cenotaphs of Shah Jahan and Mumtaz Mahal, enclosed within an octagonal chamber adorned with delicate marble screens known as jalis. The actual graves lie in a crypt below, ensuring that the sanctity and serenity of the mausoleum remain undisturbed. The interior spaces of the Taj Mahal are adorned with exquisite marble carvings, intricate inlay work, and intricate floral motifs, creating a sense of celestial beauty and tranquility.\n" +
                    "\n" +
                    "The Taj Mahal's architectural brilliance extends beyond its visual splendor to encompass mathematical precision and engineering ingenuity. The structure is designed to withstand seismic activity, with its foundations anchored deep into the earth. The intricate lattice work of the marble screens serves both decorative and functional purposes, allowing light to filter through while providing ventilation and maintaining a cool interior temperature.\n" +
                    "\n" +
                    "Throughout its storied history, the Taj Mahal has weathered political upheavals, natural disasters, and human interventions, yet it endures as a timeless symbol of love, beauty, and resilience. Recognized as a UNESCO World Heritage Site in 1983, the Taj Mahal continues to inspire awe and wonder in millions of visitors from across the globe, serving as a testament to the enduring legacy of the Mughal Empire and the boundless depths of human creativity and devotion.\n" +
                    "\n" +
                    "In conclusion, the Taj Mahal transcends mere architectural excellence to embody the essence of love, devotion, and artistic mastery. Its ethereal beauty, poignant history, and cultural significance make it a treasure of humanity, a testament to the enduring power of love to transcend time and space. As the sun sets over the Yamuna River, casting a golden glow upon its marble facade, the Taj Mahal stands as a timeless monument to the eternal bond between Shah Jahan and Mumtaz Mahal, and a beacon of hope and inspiration for generations to come.",
            location = "Agra,Uttar Pradesh,India",
        ),
        ImageData(
            id = 4,
            remoteImageUrl = R.drawable.eram_garden,
            remoteImage = R.drawable.eram,
            name = "Eram Garden",
            description =
                "Eram Garden, also known as Bagh-e Eram, is a historic Persian garden located in Shiraz, Iran. This magnificent garden is one of the most renowned and beautiful gardens in the country, famous for its lush greenery, elegant architecture, and tranquil ambiance. Spread over approximately 12 hectares, Eram Garden is a masterpiece of Persian garden design and a UNESCO World Heritage Site.\n" +
                    "\n" +
                    "The origins of Eram Garden can be traced back to the Seljuk era, but it was during the Qajar dynasty in the 19th century that the garden was extensively renovated and expanded to its current grandeur. The garden has since undergone various restorations to preserve its cultural and historical significance.\n" +
                    "\n" +
                    "One of the most striking features of Eram Garden is its layout, which follows the classic Persian garden design principles known as chahar bagh. This layout divides the garden into four quadrants by intersecting pathways or water channels, symbolizing the four rivers of paradise in Islamic tradition. Each quadrant is further subdivided into smaller sections, creating a symmetrical and harmonious arrangement of green spaces, water features, and pavilions.\n" +
                    "\n" +
                    "As visitors enter Eram Garden, they are greeted by a magnificent entrance gate adorned with intricate tile work and calligraphy, hinting at the beauty that lies within. Beyond the gate, a pathway leads through a lush expanse of trees, flowers, and manicured lawns, offering a peaceful retreat from the bustle of urban life. Tall cypress trees line the pathways, providing shade and adding to the garden's sense of serenity.\n" +
                    "\n" +
                    "At the heart of Eram Garden stands the historic Qavam House, also known as the Eram Palace. This elegant mansion showcases exquisite Persian architecture with its intricate tile work, graceful arches, and ornate facades. Originally built as a private residence for Qajar aristocrats, the Qavam House now serves as a museum, offering visitors a glimpse into Iran's rich cultural heritage. Inside, visitors can admire beautiful frescoes, delicate stucco work, and finely crafted wooden doors and windows.\n" +
                    "\n" +
                    "Surrounding the Qavam House are several pavilions, fountains, and pools, adding to the garden's enchanting atmosphere. The sound of water trickling from fountains creates a soothing soundtrack for visitors as they explore the garden's pathways and admire its natural beauty. In spring, Eram Garden bursts into color as thousands of flowers bloom, including roses, tulips, and irises, filling the air with their sweet fragrance and creating a feast for the senses.\n" +
                    "\n" +
                    "Eram Garden is not only a place of beauty but also of cultural significance. Over the centuries, it has been a gathering place for poets, scholars, and artists, who sought inspiration in its tranquil surroundings. Today, the garden continues to be a beloved destination for locals and tourists alike, offering a glimpse into Iran's rich cultural heritage and a peaceful oasis in the heart of Shiraz.\n" +
                    "\n" +
                    "In addition to its cultural and historical significance, Eram Garden also plays a vital role in environmental conservation. The garden is home to a diverse array of plant species, including many rare and endangered varieties, making it an important botanical site. Efforts are underway to preserve and protect the garden's ecological diversity, ensuring that future generations can continue to enjoy its beauty for years to come.\n" +
                    "\n" +
                    "In conclusion, Eram Garden is a true gem of Persian heritage, offering visitors a glimpse into Iran's rich cultural history and natural beauty. With its lush greenery, elegant architecture, and tranquil ambiance, it is a place of inspiration and reflection, where visitors can escape the hustle and bustle of modern life and reconnect with nature and tradition. Whether strolling through its pathways, admiring its historic landmarks, or simply relaxing in its serene surroundings, Eram Garden is a must-visit destination for anyone traveling to Shiraz.",
            location = "Iran,Shiraz",
        ),
        ImageData(
            id = 5,
            remoteImageUrl = R.drawable.hafez,
            remoteImage = R.drawable.tomb_of_hafez,
            name = "Tomb of Hafez",
            description =
                "The Tomb of Hafez, located in the beautiful city of Shiraz, Iran, stands as a timeless monument honoring one of the most celebrated Persian poets, Khwāja Shams-ud-Dīn Muhammad Hafez-e Shirazi, commonly known as Hafez. This mausoleum is not merely a physical structure but a spiritual sanctuary, revered by Iranians and poetry enthusiasts worldwide. Its significance transcends mere architectural beauty, encapsulating the essence of Persian culture, literature, and spirituality.\n" +
                    "\n" +
                    "The tomb complex is nestled in a serene garden, known as the Hafezieh, which envelops visitors in tranquility and reflection. As one approaches the entrance, they are greeted by intricately crafted tile work, intricate calligraphy, and graceful arches—a testament to the exquisite craftsmanship of Persian artisans. The garden itself is a testament to Persian garden design principles, featuring lush greenery, fragrant flowers, and bubbling fountains that create a serene atmosphere conducive to contemplation.\n" +
                    "\n" +
                    "Upon entering the mausoleum, visitors are met with a sense of reverence. The tomb of Hafez, adorned with ornate carvings and delicate inscriptions, occupies the central chamber, serving as the focal point of the structure. It is customary for visitors to recite verses from Hafez's poetry as they pay their respects, a tradition that underscores the enduring influence of his work on Persian culture.\n" +
                    "\n" +
                    "Surrounding the tomb are alcoves adorned with verses from Hafez's Divan, a collection of his lyrical and mystical poetry. These verses, known as ghazals, speak to the universal themes of love, spirituality, and the transient nature of existence, resonating with readers across time and cultures. Each alcove offers a quiet space for contemplation, inviting visitors to immerse themselves in the timeless wisdom of Hafez's words.\n" +
                    "\n" +
                    "The atmosphere within the Tomb of Hafez is imbued with a sense of spirituality and reverence. Many visitors come seeking solace, guidance, or inspiration, turning to Hafez's poetry as a source of comfort and enlightenment. Whether in times of joy or sorrow, Hafez's verses offer solace and perspective, serving as a beacon of wisdom in an ever-changing world.\n" +
                    "\n" +
                    "Beyond its spiritual significance, the Tomb of Hafez holds immense cultural and historical value. Hafez is regarded as one of the greatest Persian poets of all time, and his work has had a profound impact on Persian literature and culture. His poetry transcends the boundaries of time and space, speaking to the human experience in all its complexity and beauty.\n" +
                    "\n" +
                    "The Tomb of Hafez also serves as a pilgrimage site for literary enthusiasts and scholars from around the world. Visitors come to pay homage to Hafez's genius, to study his poetry, and to immerse themselves in the rich tapestry of Persian culture. In this way, the mausoleum serves as a bridge between past and present, connecting generations of admirers with the enduring legacy of one of Iran's most beloved poets.\n" +
                    "\n" +
                    "In addition to its cultural and historical significance, the Tomb of Hafez is a masterpiece of Persian architecture. The intricate tile work, the soaring arches, and the graceful symmetry of the design are a testament to the skill and craftsmanship of Persian artisans. Every detail of the mausoleum reflects a deep reverence for Hafez and his poetry, creating a space that is both aesthetically stunning and spiritually uplifting.\n" +
                    "\n" +
                    "In conclusion, the Tomb of Hafez stands as a testament to the enduring legacy of one of Iran's greatest poets. More than a mere mausoleum, it is a spiritual sanctuary, a cultural treasure, and a symbol of the timeless power of poetry to touch the human soul. Visitors to this hallowed site cannot help but be moved by the beauty of its design, the wisdom of its words, and the profound sense of peace that pervades its grounds.",
            location = "Iran,Shiraz",
        ),
    )
