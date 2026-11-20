import { useCart } from '../context/CartContext';

export default function CartModal({ isOpen, onClose }) {
  const { cart, removeFromCart, updateQuantity, clearCart, cartTotal, totalCount } =
    useCart();

  if (!isOpen) return null;

  return (
    <div className="modal-backdrop" onClick={onClose}>
      <div className="cart-modal" onClick={(e) => e.stopPropagation()}>
        <div className="cart-header">
          <h3>Shopping Cart ({totalCount} {totalCount === 1 ? 'item' : 'items'})</h3>
          <button className="close-modal-btn" onClick={onClose} aria-label="Close">
            ✕
          </button>
        </div>

        <div className="cart-body">
          {cart.length === 0 ? (
            <div className="empty-cart">
              <p className="empty-icon">🛒</p>
              <p>Your cart is empty.</p>
              <button className="btn-continue" onClick={onClose}>
                Start Shopping
              </button>
            </div>
          ) : (
            <div className="cart-items-list">
              {cart.map((item) => (
                <div key={item.id} className="cart-item">
                  <img
                    src={item.thumbnail}
                    alt={item.title}
                    className="cart-item-img"
                  />
                  <div className="cart-item-details">
                    <h4 className="cart-item-title">{item.title}</h4>
                    <span className="cart-item-price">${item.price}</span>
                  </div>

                  <div className="quantity-controls">
                    <button
                      className="qty-btn"
                      onClick={() => updateQuantity(item.id, item.quantity - 1)}
                    >
                      -
                    </button>
                    <span className="qty-value">{item.quantity}</span>
                    <button
                      className="qty-btn"
                      onClick={() => updateQuantity(item.id, item.quantity + 1)}
                    >
                      +
                    </button>
                  </div>

                  <span className="cart-item-subtotal">
                    ${(item.price * item.quantity).toFixed(2)}
                  </span>

                  <button
                    className="remove-btn"
                    title="Remove item"
                    onClick={() => removeFromCart(item.id)}
                  >
                    🗑️
                  </button>
                </div>
              ))}
            </div>
          )}
        </div>

        {cart.length > 0 && (
          <div className="cart-footer">
            <div className="cart-total-row">
              <span>Subtotal:</span>
              <span className="total-amount">${cartTotal}</span>
            </div>
            <div className="cart-footer-actions">
              <button className="btn-clear" onClick={clearCart}>
                Clear Cart
              </button>
              <button
                className="btn-checkout"
                onClick={() => alert(`Order placed successfully! Total: $${cartTotal}`)}
              >
                Checkout (${cartTotal})
              </button>
            </div>
          </div>
        )}
      </div>
    </div>
  );
}
