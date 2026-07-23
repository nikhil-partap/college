import LoginForm from "./LoginForm";

function LoginPage() {
  return (
    <main className="min-h-screen flex items-center justify-center bg-gradient-to-br from-green-100 via-emerald-50 to-fuchsia-100 p-4">
      <div className="relative bg-white rounded-2xl shadow-lg w-full max-w-md px-8 py-10 text-center">
        <button
          aria-label="Close"
          className="absolute top-4 right-4 text-gray-400 hover:text-gray-600 transition cursor-pointer"
        >
          <svg xmlns="http://www.w3.org/2000/svg" className="w-5 h-5" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
            <line x1="18" y1="6" x2="6" y2="18" />
            <line x1="6" y1="6" x2="18" y2="18" />
          </svg>
        </button>
        <h1 className="text-2xl font-bold text-gray-900 mb-1">Welcome back</h1>
        <p className="text-sm text-gray-500 mb-7">Sign in to your account</p>
        <LoginForm />
      </div>
    </main>
  );
}

export default LoginPage;
