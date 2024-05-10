package tests.javafuzzer3388;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:13:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4194025980894787344L;
    public static int iFld=-3;
    public static double dFld=0.82005;
    public static float fFld=0.551F;
    public byte byFld=-7;
    public float fFld1=-104.1022F;

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by) {

        int i3=13, i4=-35619, i5=-94, i6=-111, i7=194, iArr1[]=new int[N];
        double d2=50.54859;
        float f=72.395F, fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 12);
        FuzzerUtils.init(lArr1, 1922110282L);
        FuzzerUtils.init(fArr, -38.991F);

        for (i3 = 18; i3 < 313; i3++) {
            Test.instanceCount -= by;
            Test.iFld = -45581;
        }
        for (d2 = 5; d2 < 229; ++d2) {
            i5 += (int)d2;
            iArr1[(int)(d2)] *= (int)f;
            switch ((int)(((d2 % 3) * 5) + 28)) {
            case 43:
                Test.iFld |= (int)Test.instanceCount;
                Test.iFld = i5;
                lArr1[(int)(d2 + 1)] = i4;
                iArr1[(int)(d2 - 1)] |= i4;
                break;
            case 35:
                i5 -= (int)Test.instanceCount;
                for (i6 = 1; i6 < 7; i6++) {
                    i4 = (int)f;
                    i7 += (int)32377L;
                }
            case 30:
                fArr[(int)(d2 + 1)] *= i3;
                break;
            }
        }
        vMeth1_check_sum += by + i3 + i4 + Double.doubleToLongBits(d2) + i5 + Float.floatToIntBits(f) + i6 + i7 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(double d1) {

        byte by1=45;
        float f1=-58.922F;
        int i8=-1;
        long l=132L;

        vMeth1(by1);
        d1 *= Test.iFld;
        for (f1 = 17; f1 < 300; ++f1) {
            l = 6;
            while ((l -= 2) > 0) {
                Test.instanceCount += (((l * i8) + Test.instanceCount) - i8);
            }
            i8 -= i8;
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + by1 + Float.floatToIntBits(f1) + i8 + l;
    }

    public static double dMeth() {

        int i=51732, i1=5, i2=-11, i9=-38223, i10=4, i11=24828, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 65098);

        i = 1;
        while (++i < 305) {
            for (i1 = 1; i1 < 5; ++i1) {
                iArr[i + 1] += (int)Test.instanceCount;
                vMeth(Test.dFld);
                i9 = 1;
                do {
                    Test.iFld = -219;
                    i2 -= i9;
                    Test.instanceCount -= i;
                    i2 >>= i1;
                    Test.instanceCount = i1;
                } while (++i9 < 2);
                for (i10 = 1; i10 < 2; ++i10) {
                    iArr[i] *= (int)Test.instanceCount;
                }
                i11 = -1;
                iArr[i1] = (int)1.636F;
                i11 = (int)Test.fFld;
            }
        }
        long meth_res = i + i1 + i2 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b=false;
        double d=-1.106267;
        int i12=-49696, i13=6886, i14=-70, i15=12, i16=-28338, i17=-277, iArr2[]=new int[N];
        long l1=11045L, lArr[]=new long[N];
        short s=4193;
        float f2=1.342F;

        FuzzerUtils.init(lArr, 45371L);
        FuzzerUtils.init(iArr2, 50645);

        b = ((--Test.iFld) > (lArr[(Test.iFld >>> 1) % N] - (d += Test.iFld)));
        dMeth();
        switch (((Test.iFld >>> 1) % 2) + 106) {
        case 106:
            Test.iFld = Test.iFld;
            Test.iFld += byFld;
            iArr2[(Test.iFld >>> 1) % N] -= (int)Test.fFld;
            fFld1 += Test.iFld;
        case 107:
        }
        if (b) {
            iArr2[(Test.iFld >>> 1) % N] -= (int)-147L;
            iArr2 = iArr2;
            Test.iFld += (int)d;
        }
        for (i12 = 14; i12 < 253; ++i12) {
            for (i14 = 5; 105 > i14; ++i14) {
                i13 -= -11;
                i15 += (((i14 * Test.instanceCount) + i12) - i13);
                l1 += (((i14 * i14) + i12) - Test.instanceCount);
                Test.iFld <<= (int)Test.instanceCount;
                i15 |= Test.iFld;
                for (i16 = 1; i16 < 2; ++i16) {
                    i15 = (int)8241071139171641772L;
                }
                i13 += i14;
                fFld1 += (i14 * i15);
                Test.fFld *= (float)Test.dFld;
                if (b) continue;
            }
            if (b) {
                iArr2[i12 - 1] <<= s;
                i17 = Test.iFld;
            } else if (b) {
                f2 = 105;
                while (--f2 > 0) {
                    Test.iFld &= i16;
                    Test.instanceCount += (long)(f2 * f2);
                }
            } else if (b) {
                try {
                    iArr2[i12] = (Test.iFld / iArr2[i12 - 1]);
                    iArr2[i12] = (i12 % iArr2[i12 - 1]);
                    i13 = (-124 / i14);
                } catch (ArithmeticException a_e) {}
            } else {
                Test.instanceCount += i12;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}