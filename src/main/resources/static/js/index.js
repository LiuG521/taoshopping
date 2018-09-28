(function(){
	let totalBtn1 = 0,
		totalBtn2 = 0;
	function clickBtn() {
		$('button').on('click',function () {
			let img = $(this).parent().find('img');
			let btn = $(this).attr('class');
			let flyImg = img.clone().css({
				'opacity':'0.6'
			});
			$('.wrapper').append(flyImg);
			flyImg.css({
				'z-index':999,
				'border':'3px solid #fff',
				'position': 'absolute',
				'height' : img.height() + 'px',
				'width' : img.width() + 'px',
				'top' : 550 +'px',
				'left' : 895 + 'px'
			})
			flyImg.animate({
				'width' : 62 + 'px',
				'height' : 62 + 'px',
				'border-radius' : 100 + '%'
			},function(){
				let t;
				if (btn == 'btn1'){
					t = $('#btn1-add').offset().top;
					totalBtn1 ++;
					if(totalBtn1>99){
						totalBtn1 = 99
					}
				}
				flyImg.animate({
					'top':80,
					'left':1320 + 'px',
					'height':0 +'px',
					'width' :0+'px',
				},1500,function(){
					flyImg.remove();
					$('#btn1-add').html(totalBtn1);
				})
			});
		})
	}
	clickBtn();
})();