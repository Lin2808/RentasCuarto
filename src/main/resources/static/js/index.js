document.addEventListener('DOMContentLoaded', function () {
    const backgrounds = document.getElementById('backgrounds');
    const images = backgrounds.getElementsByTagName('img');
    const overlay = document.getElementById('overlay');
    let currentIndex = 0;

    function changeBackground() {
        currentIndex = (currentIndex + 1) % images.length;

        // Oculta todas las imágenes y el overlay
        Array.from(images).forEach(img => {
            img.style.opacity = 0;
        });

        overlay.style.opacity = 0;

        // Muestra la imagen actual y el overlay
        images[currentIndex].style.opacity = 1;
        overlay.style.opacity = 1;
    }

    // Cambia el fondo cada 5 segundos (ajusta según lo que prefieras)
    setInterval(changeBackground, 5000);
});