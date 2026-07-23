function InputField({label, type = "text", id, value, onChange, placeholder}) {
  return (
    <div className="flex flex-col gap-1.5">
      <label htmlFor={id} className="text-sm font-medium text-gray-700">
        {label}
      </label>
      <div className="relative flex items-center">
        <input
          type={type}
          id={id}
          name={id}
          value={value}
          onChange={onChange}
          placeholder={placeholder}
          autoComplete={type === "password" ? "current-password" : "username"}
          required
          className="w-full px-3.5 py-2.5 border border-gray-300 rounded-lg text-sm text-gray-900 bg-white placeholder-gray-400 outline-none transition focus:border-indigo-500 focus:ring-3 focus:ring-indigo-100"
        />
        {type === "password" && (
          <div className="absolute right-3 group">
            <span className="flex items-center justify-center w-4 h-4 rounded-full bg-gray-200 text-gray-500 text-xs font-bold cursor-default select-none">
              ?
            </span>
            <div className="absolute bottom-full right-0 mb-2 w-56 bg-gray-800 text-white text-xs rounded-lg px-3 py-2 opacity-0 invisible group-hover:opacity-100 group-hover:visible transition-all duration-200 pointer-events-none z-10">
              Password must be at least 8 characters and include a number and a
              special character.
              <span className="absolute top-full right-3 border-4 border-transparent border-t-gray-800" />
            </div>
          </div>
        )}
      </div>
    </div>
  );
}

export default InputField;
