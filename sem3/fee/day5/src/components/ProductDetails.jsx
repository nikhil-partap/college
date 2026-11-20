import { useState } from 'react';
import { useCart } from '../context/CartContext';

export default function ProductDetails({ product, onClose }) {
  const { addToCart } = useCart();
  const [added, setAdded] = useState(false);
  const [selectedImg, setSelectedImg] = useState(product?.thumbnail);

  if (!product) return null;

  const handleAdd = () => {
    addToCart(product);
    setAdded(true);
    setTimeout(() => setAdded(false), 1200);
  };

  return (
    <div className="modal-backdrop" onClick={onClose}>
      <div className="details-modal" onClick={(e) => e.stopPropagation()}>
        <button className="close-modal-btn" onClick={onClose} aria-label="Close">
          ✕
        </button>

        <div className="details-grid">
          <div className="details-gallery">
            <div className="main-image-wrap">
              <img
                src={selectedImg || product.thumbnail}
                alt={product.title}
                className="details-main-img"
              />
            </div>
            {product.images && product.images.length > 1 && (
              <div className="thumbnail-list">
                {product.images.map((imgUrl, idx) => (
                  <img
                    key={idx}
                    src={imgUrl}
                    alt={`${product.title}-${idx}`}
                    className={`thumb-item ${selectedImg === imgUrl ? 'active' : ''}`}
                    onClick={() => setSelectedImg(imgUrl)}
                  />
                ))}
              </div>
            )}
          </div>

          <div className="details-content">
            <span className="badge category-tag">{product.category}</span>
            <h2 className="details-title">{product.title}</h2>
            {product.brand && <p className="details-brand">Brand: <strong>{product.brand}</strong></p>}

            <div className="details-price-row">
              <span className="details-price">${product.price}</span>
              {product.discountPercentage && (
                <span className="discount-tag">
                  {product.discountPercentage}% OFF
                </span>
              )}
              <span className="details-rating">★ {product.rating} / 5</span>
            </div>

            <p className="details-description">{product.description}</p>

            <div className="details-specs">
              <div className="spec-item">
                <span className="spec-label">Availability:</span>
                <span className="spec-value">{product.availabilityStatus || (product.stock > 0 ? 'In Stock' : 'Out of Stock')}</span>
              </div>
              <div className="spec-item">
                <span className="spec-label">Stock:</span>
                <span className="spec-value">{product.stock} units</span>
              </div>
              {product.warrantyInformation && (
                <div className="spec-item">
                  <span className="spec-label">Warranty:</span>
                  <span className="spec-value">{product.warrantyInformation}</span>
                </div>
              )}
              {product.returnPolicy && (
                <div className="spec-item">
                  <span className="spec-label">Return Policy:</span>
                  <span className="spec-value">{product.returnPolicy}</span>
                </div>
              )}
            </div>

            <div className="details-actions">
              <button
                className={`btn-add-large ${added ? 'added' : ''}`}
                onClick={handleAdd}
              >
                {added ? '✓ Added to Cart' : 'Add to Cart'}
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
