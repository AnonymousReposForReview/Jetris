package tests.javafuzzer2681;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:41:32 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=416659703L;
    public int iFld=130;
    public static float fFld=42.823F;
    public static volatile byte byFld=50;
    public double dFld=0.4128;
    public static volatile long lFld=-124L;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)41);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i1, int i2, int i3) {

        int i4=-183, i5=-4, i6=44430, i7=-13, i8=24283, i9=48974, iArr[]=new int[N];
        boolean b1=true;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr, -9233L);
        FuzzerUtils.init(fArr, 0.964F);

        for (i4 = 2; i4 < 149; i4++) {
            Test.instanceCount *= (long)-1.121965;
            iArr = iArr;
            if (b1) continue;
            for (i6 = 1; i6 < 11; i6 += 3) {
                lArr[i4] += -181;
                i5 -= -54748;
                i5 = i5;
                i1 *= (int)Test.fFld;
                i2 *= (int)Test.instanceCount;
            }
            for (i8 = 1; i8 < 11; i8++) {
                fArr[i4 + 1] -= Test.instanceCount;
            }
            Test.fFld += Test.instanceCount;
            i3 <<= i3;
            try {
                i3 = (i7 / iArr[i4 - 1]);
                i2 = (-54885 / i2);
                i3 = (iArr[i4 + 1] % i5);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + (b1 ? 1 : 0) + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i) {

        float f1=-117.890F;
        int i10=-63580, i11=-4, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 208);

        f1 = iMeth1(i, i, i);
        i += i;
        Test.instanceCount = Test.instanceCount;
        for (i10 = 13; i10 < 315; ++i10) {
            iArr1 = iArr1;
        }
        Test.byFld = (byte)i;
        Test.byArrFld[(28498 >>> 1) % N] = (byte)13;
        Test.byFld = (byte)i;
        long meth_res = i + Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public int iMeth() {

        float f=1.569F;
        boolean b=false;
        int i13=2, i14=181, i15=44561, iArr2[]=new int[N];
        short s=19618;

        FuzzerUtils.init(iArr2, 13);

        f = 374;
        while ((f -= 2) > 0) {
            b = (((iFld - iFld) + Integer.reverseBytes(iFld)) <= fMeth(iFld));
        }
        for (int i12 : iArr2) {
            Test.instanceCount = iFld;
            i13 = 1;
            do {
                i12 = -67;
                i12 <<= Test.byFld;
                for (i14 = 1; i14 < 1; i14++) {
                    switch ((i14 % 10) + 38) {
                    case 38:
                        switch ((i14 % 5) + 109) {
                        case 109:
                            iFld += (i14 * i14);
                            i15 >>= i12;
                            break;
                        case 110:
                            i12 %= (int)(Test.instanceCount | 1);
                            i15 += (i14 + i13);
                            Test.fFld = s;
                            break;
                        case 111:
                            s -= (short)56L;
                            break;
                        case 112:
                            Test.fFld = i12;
                        case 113:
                            b = b;
                            break;
                        }
                        break;
                    case 39:
                        iFld <<= -4;
                    case 40:
                        iArr2[i14 + 1] *= i12;
                        break;
                    case 41:
                        if (i14 != 0) {
                        }
                        break;
                    case 42:
                        i12 = i14;
                        break;
                    case 43:
                        dFld += i12;
                        break;
                    case 44:
                        i12 += (((i14 * i14) + i13) - iFld);
                        break;
                    case 45:
                        dFld -= 9;
                        break;
                    case 46:
                        Test.instanceCount += (i14 * s);
                        break;
                    case 47:
                        i15 = i15;
                        break;
                    }
                }
            } while (++i13 < 4);
        }
        long meth_res = Float.floatToIntBits(f) + (b ? 1 : 0) + i13 + i14 + i15 + s + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=5196, i17=-182, i18=-4, i19=9, i20=8, i21=40746, i22=-39845, i23=-20643, i24=4, i25=60459, i26=8358,
            i27=62917, i28=-4, iArr3[][]=new int[N][N];
        long l=-3111457788L, lArr1[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr3, 23573);
        FuzzerUtils.init(fArr1, 0.632F);
        FuzzerUtils.init(lArr1, 4133169592L);

        iFld -= (Math.abs(iMeth()) + iFld);
        for (i16 = 20; i16 < 334; ++i16) {
            iFld -= i16;
        }
        iFld = 8952;
        Test.instanceCount -= i16;
        i17 -= (int)dFld;
        i18 = 1;
        do {
            Test.instanceCount = Test.instanceCount;
        } while (++i18 < 226);
        for (i19 = 1; i19 < 344; i19++) {
            i21 += -237;
        }
        for (i22 = 10; i22 < 325; i22++) {
            for (i24 = 4; i24 < 80; ++i24) {
                Test.byFld = (byte)Test.fFld;
                i20 += (((i24 * Test.fFld) + i20) - i21);
                Test.byFld ^= (byte)4101;
                iArr3[i22 + 1][i24 - 1] *= -7267;
                switch (((-162 >>> 1) % 2) + 15) {
                case 15:
                    i17 *= (int)dFld;
                    fArr1[i22] = 15212L;
                    for (l = 1; l < 2; l++) {
                        i23 *= -3;
                        Test.instanceCount -= -31;
                    }
                    break;
                case 16:
                    Test.fFld *= l;
                    break;
                }
                Test.instanceCount = i20;
                lArr1[i22 + 1] += Test.lFld;
                Test.fFld += (-4427 + (i24 * i24));
                for (i27 = 1; i27 < 2; i27++) {
                    i25 = i27;
                    i28 = (int)8120570414444878618L;
                }
                i23 += (i24 + i18);
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
