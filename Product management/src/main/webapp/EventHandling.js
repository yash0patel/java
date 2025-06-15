let navbuttons, listProductContainer, addProductContainer, sortingContainer, filterContainer;

document.addEventListener('DOMContentLoaded', () => {
	navbuttons = document.querySelectorAll('.navbtn');
	listProductContainer = document.querySelector('.listProduct-container');
	addProductContainer = document.querySelector('.addProduct-container');
	sortingContainer = document.querySelector('.sorting-container');
	filterContainer = document.querySelector('.filter-container');
	toggleHide();
});

const hideAllSectionsExcept = (section = null) => {
	[listProductContainer, addProductContainer, sortingContainer, filterContainer].forEach((container) => {
		if (container !== section) {
			container.style.display = "none";
		}
	});
};

function toggleHide() {
	navbuttons.forEach(button => {
		button.addEventListener('click', (event) => {
			const id = event.target.id;
			switch (id) {
				case 'view-all-products':
					hideAllSectionsExcept(listProductContainer);
					listProductContainer.style.display = listProductContainer.style.display == 'block' ? 'none' : 'block';
					break;
				case 'add-product':
					hideAllSectionsExcept(addProductContainer);
					addProductContainer.style.display = addProductContainer.style.display == 'block' ? 'none' : 'block';
					break;
				case 'sort-product':
					hideAllSectionsExcept(sortingContainer);
					sortingContainer.style.display = sortingContainer.style.display == 'block' ? 'none' : 'block';
					break;
				case 'filter':
					hideAllSectionsExcept(filterContainer);
					filterContainer.style.display = filterContainer.style.display == 'block' ? 'none' : 'block';
					break;
			}
		});
	});
}