function LoginButton({ label = 'Login', disabled = false }) {
  return (
    <button
      type="submit"
      disabled={disabled}
      className="w-full py-2.5 px-4 mt-1 bg-indigo-500 hover:bg-indigo-600 active:scale-[0.98] disabled:bg-indigo-300 disabled:cursor-not-allowed text-white font-semibold text-base rounded-lg transition cursor-pointer"
    >
      {label}
    </button>
  )
}

export default LoginButton
